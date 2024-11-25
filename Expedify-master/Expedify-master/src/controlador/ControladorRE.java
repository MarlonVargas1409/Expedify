package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.RegistroCaja;
import modelo.RegistroCajaDAO;
import modelo.RegistroExpediente;
import modelo.RegistroExpedienteDAO;
import vista.RegistrarCaja;
import vista.RegistrarExpediente;

/**
 *
 * @author DELL 5490
 */
public class ControladorRE implements ActionListener {

    RegistroExpediente registro = new RegistroExpediente();
    RegistroExpedienteDAO Dao = new RegistroExpedienteDAO();
    RegistrarExpediente vista = new RegistrarExpediente();
    DefaultTableModel model = new DefaultTableModel();

    public ControladorRE(RegistrarExpediente v) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.vista = v;
        this.vista.btnAgregarEX.addActionListener(this);
        this.vista.btnCancelarEX.addActionListener(this);
        this.vista.btnBuscarEX.addActionListener(this);
        this.vista.btnModificarEX.addActionListener(this);
        this.vista.btnEliminarEX.addActionListener(this);

        //Limpiar formulario y Listar contactos
        limpiarCampos(v);
        listarExpediente(vista.tablaEX);
    }

    public void agregar() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        int r;

        String expediente = vista.txtExpedienteEX.getText();
        String fecha = vista.txtFechaEX.getText();
        String propietario = vista.txtPropietarioEX.getText();
        String sala = vista.menuSala.getSelectedItem().toString();
        String tribunal = vista.menuTribunal.getSelectedItem().toString();
        String tipoExpediente = vista.menuTipoEX.getSelectedItem().toString();

        registro.setExpediente(expediente);
        registro.setFecha(fecha);
        registro.setPropietario(propietario);
        registro.setSala(sala);
        registro.setTribunal(tribunal);
        registro.setTipo_expediente(tipoExpediente);

        if (validarCampos(vista) > 0) {
            String m = Dao.registrar(registro);
            if (m != null && m.equals("exito")) {
                JOptionPane.showMessageDialog(vista, "Error: al agregar datos.", "Error!", JOptionPane.ERROR_MESSAGE);
                listarExpediente(vista.tablaEX);
                limpiarCampos(vista);
            } else {
                JOptionPane.showMessageDialog(vista, "Datos agregados", "Bien", JOptionPane.INFORMATION_MESSAGE);
                listarExpediente(vista.tablaEX);
                limpiarCampos(vista);
            }
        }
    }

    public void modificar() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (validarCampos(vista) > 0) {
            String expediente = vista.txtExpedienteEX.getText();
            String fecha = vista.txtFechaEX.getText();
            String propietario = vista.txtPropietarioEX.getText();
            String sala = vista.menuSala.getSelectedItem().toString();
            String tribunal = vista.menuTribunal.getSelectedItem().toString();
            String tipoExpediente = vista.menuTipoEX.getSelectedItem().toString();

            registro.setExpediente(expediente);
            registro.setFecha(fecha);
            registro.setPropietario(propietario);
            registro.setSala(sala);
            registro.setTribunal(tribunal);
            registro.setTipo_expediente(tipoExpediente);

            String mensaje = Dao.actualizar(registro);
            if (mensaje.equals("exito")) {
                JOptionPane.showMessageDialog(vista, "Registro modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                listarExpediente(vista.tablaEX);
                limpiarCampos(vista);
            } else {
                JOptionPane.showMessageDialog(vista, "Error al modificar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void cancelar() {
        // Limpiar los campos del formulario
        limpiarCampos(vista);

        // Restaurar el estado inicial de los botones
        vista.btnAgregarEX.setEnabled(true);
        vista.btnModificarEX.setEnabled(true);
        vista.btnEliminarEX.setEnabled(true);
        vista.btnCancelarEX.setEnabled(false);

        // Mostrar mensaje de confirmación
        JOptionPane.showMessageDialog(vista, "Campos limpiados y operación cancelada.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public void eliminar() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        int fila = vista.tablaEX.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione un registro para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            String expediente = (String) vista.tablaEX.getValueAt(fila, 0);
            int confirm = JOptionPane.showConfirmDialog(vista, "¿Está seguro de eliminar el registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int mensaje = Dao.eliminar(expediente);
                if (mensaje == 1 ) {
                    JOptionPane.showMessageDialog(vista, "Registro eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    listarExpediente(vista.tablaEX);
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al eliminar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void buscar() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String busqueda = vista.txtBuscarEX.getText();
        if (!busqueda.trim().isEmpty()) {
            List<RegistroExpediente> resultados = Dao.listar(busqueda);
            if (resultados.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "No se encontraron resultados.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                DefaultTableModel modelo = (DefaultTableModel) vista.tablaEX.getModel();
                modelo.setRowCount(0); // Limpiar la tabla antes de agregar los resultados
                for (RegistroExpediente registro : resultados) {
                    modelo.addRow(new Object[]{
                        registro.getExpediente(),
                        registro.getTipo_expediente(),
                        registro.getTribunal(),
                        registro.getSala(),
                        registro.getPropietario(),
                        registro.getFecha()
                    });
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese un criterio de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public final void listarExpediente(JTable tabla) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        model = (DefaultTableModel) tabla.getModel();
        List<RegistroExpediente> lista = (List<RegistroExpediente>) Dao.listar(vista.txtBuscarEX.getText());
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getExpediente();
            object[1] = lista.get(i).getTipo_expediente();
            object[2] = lista.get(i).getTribunal();
            object[3] = lista.get(i).getSala();
           object[4] = lista.get(i).getPropietario();
            object[5] = lista.get(i).getFecha();

            model.addRow(object);
        }
        vista.tablaEX.setModel(model);
    }

    private void limpiarCampos(RegistrarExpediente v) {
        v.txtExpedienteEX.setText("");
        v.txtFechaEX.setText("");
        v.txtPropietarioEX.setText("");
        v.txtBuscarEX.setText("");
    }

    private int validarCampos(RegistrarExpediente vista) {
        int validacion = 1;

        if (vista.txtExpedienteEX.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo expediente, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtExpedienteEX.requestFocus();
            validacion = 0;
        } else if (vista.txtFechaEX.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo de fecha, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtFechaEX.requestFocus();
            validacion = 0;
        } else if (vista.txtPropietarioEX.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "verificar el campo propietario, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtPropietarioEX.requestFocus();
            validacion = 0;
        }
        if (vista.menuSala.getSelectedItem() == null || vista.menuSala.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo Sala, no puede estar vacío.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.menuSala.requestFocus();
            validacion = 0;
        }

        if (vista.menuTribunal.getSelectedItem() == null || vista.menuTribunal.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo Tribunal, no puede estar vacío.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.menuTribunal.requestFocus();
            validacion = 0;
        }

        if (vista.menuTipoEX.getSelectedItem() == null || vista.menuTipoEX.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo departamento, no puede estar vacío.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.menuTipoEX.requestFocus();
            validacion = 0;
        }

        return validacion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregarEX) {
            try {
                agregar();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(ControladorRE.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                listarExpediente(vista.tablaEX);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorRE.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControladorRE.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControladorRE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vista.btnCancelarEX) {
            this.vista.btnAgregarEX.setEnabled(true);
            this.vista.btnCancelarEX.setEnabled(false);
            this.vista.btnEliminarEX.setEnabled(true);
            this.vista.btnModificarEX.setEnabled(true);
            vista.btnBuscarEX.setText("");
            limpiarCampos(vista);

        }
        if (e.getSource() == vista.btnBuscarEX) {
            if (!this.vista.txtBuscarEX.getText().equals("")) {
                this.vista.btnAgregarEX.setEnabled(true);
                this.vista.btnCancelarEX.setEnabled(true);
                this.vista.btnModificarEX.setEnabled(false);
                this.vista.btnEliminarEX.setEnabled(false);
                limpiarCampos(vista);
                try {
                    // limpiarTabla();
                    listarExpediente(vista.tablaEX);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorRE.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ControladorRE.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ControladorRE.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.vista.btnCancelarEX.setEnabled(true);
                JOptionPane.showMessageDialog(vista, "El campo de busqueda esta vacio.");
            }
        }
    }
}

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
import vista.RegistrarCaja;

/**
 *
 * @author DELL 5490
 */
public class ControladorRC implements ActionListener {

    RegistroCaja registro = new RegistroCaja();
    RegistroCajaDAO Dao = new RegistroCajaDAO();
    RegistrarCaja vista = new RegistrarCaja();
    DefaultTableModel model = new DefaultTableModel();

    public ControladorRC(RegistrarCaja v) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.vista = v;
        this.vista.btnAgregarCA.addActionListener(this);
        this.vista.btnCancelarCA.addActionListener(this);
        this.vista.btnBuscarCA.addActionListener(this);
        this.vista.btnAplicar.addActionListener(this);


        //Limpiar formulario y Listar contactos
        limpiarCampos(v);
        listarcaja(vista.tablaCA);
    }

    public void agregar() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        int r;

        String expediente = vista.txtExpedienteCA.getText();
        String estado = vista.menuEstadoCA.getSelectedItem().toString();
        String fecha = vista.txtFechaCA.getText();
        String departamento = vista.menuDepartamento.getSelectedItem().toString();
        String propietario = vista.txtPropietarioCA.getText();
        String usuario = vista.txtUsuarioCA.getText();
        String sala = vista.txtSalaCA.getText();
        String caja = vista.txtCajaCA.getText();
        String comentario = vista.txtComentarioCA.getText();

        registro.setExpediente(expediente);
        registro.setEstado(estado);
        registro.setFecha(fecha);
        registro.setDepartamento(departamento);
        registro.setPropietario(propietario);
        registro.setUsuario(usuario);
        registro.setSala(sala);
        registro.setCaja(caja);
        registro.setComentario(comentario);

        if (validarCampos(vista) > 0) {
            String m = Dao.registrarcaja(registro);
            if (m != null && m.equals("exito")) {
                JOptionPane.showMessageDialog(vista, "Error: al agregar datos.", "Error!", JOptionPane.ERROR_MESSAGE);
                listarcaja(vista.tablaCA);
                limpiarCampos(vista);
            } else {
                JOptionPane.showMessageDialog(vista, "Datos agregados", "Bien", JOptionPane.INFORMATION_MESSAGE);
                listarcaja(vista.tablaCA);
                limpiarCampos(vista);
            }
        }
    }

    public final void listarcaja(JTable tabla) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        model = (DefaultTableModel) tabla.getModel();
        List<RegistroCaja> lista = (List<RegistroCaja>) Dao.listar(vista.txtBuscarCA.getText());
        Object[] object = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getEstado();
            object[1] = lista.get(i).getExpediente();
            object[2] = lista.get(i).getCaja();
            object[3] = lista.get(i).getSala();
            object[4] = lista.get(i).getDepartamento();
            object[5] = lista.get(i).getUsuario();
            object[6] = lista.get(i).getFecha();
            object[7] = lista.get(i).getComentario();

            model.addRow(object);
        }
        vista.tablaCA.setModel(model);
    }

    private void limpiarCampos(RegistrarCaja v) {
        v.txtExpedienteCA.setText("");
        v.txtFechaCA.setText("");
        v.txtComentarioCA.setText("");
        v.txtPropietarioCA.setText("");
        v.txtUsuarioCA.setText("");
        v.txtSalaCA.setText("");
        v.txtCajaCA.setText("");
    }

    private int validarCampos(RegistrarCaja vista) {
        int validacion = 1;

        if (vista.txtExpedienteCA.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo expediente, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtExpedienteCA.requestFocus();
            validacion = 0;
        } else if (vista.txtFechaCA.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo de fecha, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtFechaCA.requestFocus();
            validacion = 0;
        } else if (vista.txtUsuarioCA.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo usuario, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtUsuarioCA.requestFocus();
            validacion = 0;
        } else if (vista.txtPropietarioCA.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "verificar el campo propietario, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtPropietarioCA.requestFocus();
            validacion = 0;
        } else if (vista.txtSalaCA.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "verificar el campo sala, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtSalaCA.requestFocus();
            validacion = 0;

        } else if (vista.txtCajaCA.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "verificar el campo caja, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.txtCajaCA.requestFocus();
            validacion = 0;

        }
        if (vista.menuDepartamento.getSelectedItem() == null || vista.menuDepartamento.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(vista, "Verificar el campo departamento, no puede estar vacío.", "Error!", JOptionPane.ERROR_MESSAGE);
            vista.menuDepartamento.requestFocus();
            validacion = 0;
        }

        return validacion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregarCA) {
            try {
                agregar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                listarcaja(vista.tablaCA);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == vista.btnCancelarCA) {
            this.vista.btnAgregarCA.setEnabled(true);
            this.vista.btnCancelarCA.setEnabled(false);
            this.vista.btnAplicar.setEnabled(true);
            this.vista.btnBuscarCA.setEnabled(true);
            vista.btnBuscarCA.setText("");
            limpiarCampos(vista);

        }
        if (e.getSource() == vista.btnBuscarCA) {
            if (!this.vista.txtBuscarCA.getText().equals("")) {
                this.vista.btnAgregarCA.setEnabled(true);
                this.vista.btnCancelarCA.setEnabled(true);
                this.vista.btnAplicar.setEnabled(false);
                limpiarCampos(vista);
                try {
                    // limpiarTabla();
                    listarcaja(vista.tablaCA);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ControladorRC.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.vista.btnCancelarCA.setEnabled(true);
                JOptionPane.showMessageDialog(vista, "El campo de busqueda esta vacio.");
            }
        }
    }

}

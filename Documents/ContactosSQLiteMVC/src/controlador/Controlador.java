package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Contactos;
import modelo.ContactosDAO;
import vista.Vista;

/**
 * Controlador del formulario contactos.
 *
 * @author jquezada
 */
public class Controlador implements ActionListener {

    /**
     * Declaracion de los objetos necesarios: dao = Data Access Object c =
     * Estructura de datos del objeto vista = Formulario de contactos modelo =
     * Modelo donde se cargan los datos de la tabla
     */
    ContactosDAO dao = new ContactosDAO();
    Contactos c = new Contactos();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Constructor de la clase Controlador, se encarga de inicializar los
     * componentes del formulario de contactos. Recibe como parameto la ventana
     * "Vista".
     *
     * @param v
     */
    public Controlador(Vista v) {
        this.vista = v;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnEditar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.txtBuscar.addActionListener(this);

        this.vista.btnGuardar.setEnabled(true);
        this.vista.btnEditar.setEnabled(false);
        this.vista.btnActualizar.setEnabled(false);
        this.vista.btnCancelar.setEnabled(true);
        this.vista.btnEliminar.setEnabled(false);
        this.vista.btnBuscar.setEnabled(true);

        //Limpiar formulario y Listar contactos
        limpiarCampos(v);
        listar(vista.tblContactos);
    }

    /**
     * Este metodo se encarga de cargar los registros dentro de la tabla de
     * contactos.
     *
     * @param tabla
     */
    public void listarContacto(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<Contactos> lista = (List<Contactos>) dao.listarRegistro(vista.txtBuscar.getText());
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombres();
            object[2] = lista.get(i).getApellidos();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getCorreo();
            modelo.addRow(object);
        }
        vista.tblContactos.setModel(modelo);
    }

    /**
     * Este metodo se encarga de cargar los registros dentro de la tabla de
     * contactos.
     *
     * @param tabla
     */
    public final void listar(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<Contactos> lista = (List<Contactos>) dao.listar();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombres();
            object[2] = lista.get(i).getApellidos();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getCorreo();
            modelo.addRow(object);
        }
        vista.tblContactos.setModel(modelo);
    }

    /**
     * Este metodo se encarga de registrar un nuevo contacto.
     */
    public void agregar() {

        int r;

        String Nombres = vista.txtNombres.getText();
        String Apellidos = vista.txtApellidos.getText();
        String Telefono = vista.txtTelefono.getText();
        String Correo = vista.txtCorreo.getText();

        c.setNombres(Nombres);
        c.setApellidos(Apellidos);
        c.setTelefono(Telefono);
        c.setCorreo(Correo);

        if (validarCampos(vista) > 0) {
            r = dao.agregar(c);
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Contacto agregado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
                listar(vista.tblContactos);
                limpiarCampos(vista);
            } else {
                JOptionPane.showMessageDialog(vista, "Error: tratando de agregar contacto.", "Error!", JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
                listar(vista.tblContactos);
                limpiarCampos(vista);
            }
        }
    }

    /**
     * Este metodo pone en modo edicion el formulario y carga los datos del
     * contacto a ser modificado.
     */
    public void editar() {

        int fila = vista.tblContactos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila para la edicion.", "Error!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblContactos);
            limpiarCampos(vista);
        } else {
            int id = Integer.parseInt((String) vista.tblContactos.getValueAt(fila, 0).toString());
            String Nombres = (String) vista.tblContactos.getValueAt(fila, 1);
            String Apellidos = (String) vista.tblContactos.getValueAt(fila, 2);
            String Telefono = (String) vista.tblContactos.getValueAt(fila, 3);
            String Correo = (String) vista.tblContactos.getValueAt(fila, 4);

            vista.txtID.setText("" + id);
            vista.txtNombres.setText(Nombres);
            vista.txtApellidos.setText(Apellidos);
            vista.txtTelefono.setText(Telefono);
            vista.txtCorreo.setText(Correo);
            vista.txtNombres.requestFocus();
        }
    }

    /**
     * Este metodo se encarga de actualizar el contacto seleccionado dentro de
     * la tabla.
     */
    public void actualizar() {
        int r;

        int fila = vista.tblContactos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila para la actualizacion.", "Error!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblContactos);
            limpiarCampos(vista);
        } else {
            if (validarCampos(vista) > 0) {
                int id = Integer.parseInt(vista.txtID.getText());
                String Nombres = vista.txtNombres.getText();
                String Apellidos = vista.txtApellidos.getText();
                String Telefono = vista.txtTelefono.getText();
                String Correo = vista.txtCorreo.getText();

                c.setId(id);
                c.setNombres(Nombres);
                c.setApellidos(Apellidos);
                c.setTelefono(Telefono);
                c.setCorreo(Correo);

                r = dao.actualizar(c);
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Contacto actualizado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblContactos);
                    limpiarCampos(vista);
                } else {
                    JOptionPane.showMessageDialog(vista, "Error: tratando de actualizar contacto.", "Error!", JOptionPane.ERROR_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblContactos);
                    limpiarCampos(vista);
                }
            }
        }
    }

    /**
     * Este metodo procede a eliminar el registro seleccionado dentro de la
     * tabla.
     */
    public void eliminar() {

        int fila = vista.tblContactos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila a borrar.", "Error!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblContactos);
            limpiarCampos(vista);
        } else if (JOptionPane.showConfirmDialog(vista, "Esta seguro de eliminar este contacto?", "Borrar", JOptionPane.YES_NO_OPTION) == 0) {
            int id = Integer.parseInt((String) vista.tblContactos.getValueAt(fila, 0).toString());

            dao.eliminar(id);
            JOptionPane.showMessageDialog(vista, "Contacto eliminado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            limpiarTabla();
            listar(vista.tblContactos);
            limpiarCampos(vista);
        }
    }

    /**
     * Este metodo se encarga de limpiar los datos de la tabla antes de cargarla
     * al inicio o al refrescar los datos.
     */
    public void limpiarTabla() {
        for (int i = 0; i < vista.tblContactos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    /**
     * Este metodo limpia los campos del formulario antes de ser utilizado.
     *
     * @param v
     */
    public final void limpiarCampos(Vista v) {
        v.txtID.setText("");
        v.txtNombres.setText("");
        v.txtApellidos.setText("");
        v.txtTelefono.setText("");
        v.txtCorreo.setText("");
        v.txtNombres.requestFocus();
    }

    /**
     * Este metodo valida los campos del formulario y devuelve si los campos han
     * sido validados.
     *
     * @param v
     * @return validacion
     */
    public int validarCampos(Vista v) {

        int validacion = 1;

        if (v.txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo nombres, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtNombres.requestFocus();
            validacion = 0;
        } else if (v.txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo apellidos, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtApellidos.requestFocus();
            validacion = 0;
        } else if (v.txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo telefono, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtTelefono.requestFocus();
            validacion = 0;
        } else if (v.txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo correo, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtCorreo.requestFocus();
            validacion = 0;
        }
//        } else {
//            validacion = 1;
//        }

        return validacion;
    }

    /**
     * Este metodo verifica si se ha producido algun evento dentro del
     * formulario.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            agregar();
            listar(vista.tblContactos);
        }
        if (e.getSource() == vista.btnEditar) {
            editar();
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(true);
        }
        if (e.getSource() == vista.btnActualizar) {
            actualizar();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            limpiarTabla();
            listar(vista.tblContactos);
            vista.txtNombres.requestFocus();
        }
        if (e.getSource() == vista.btnEliminar) {
            eliminar();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            limpiarCampos(vista);
            limpiarTabla();
            listar(vista.tblContactos);
        }
        if (e.getSource() == vista.btnCancelar) {
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEditar.setEnabled(false);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            this.vista.btnEliminar.setEnabled(false);
            this.vista.lblAviso.setVisible(false);
            vista.txtBuscar.setText("");
            limpiarCampos(vista);
            limpiarTabla();
            listar(vista.tblContactos);
        }
        if (e.getSource() == vista.btnBuscar) {
            if (!this.vista.txtBuscar.getText().equals("")) {
                this.vista.btnGuardar.setEnabled(true);
                this.vista.btnEditar.setEnabled(false);
                this.vista.btnActualizar.setEnabled(false);
                this.vista.btnCancelar.setEnabled(true);
                this.vista.btnEliminar.setEnabled(false);
                limpiarCampos(vista);
                limpiarTabla();
                listarContacto(vista.tblContactos);
            } else {
                this.vista.btnCancelar.setEnabled(true);
                JOptionPane.showMessageDialog(vista, "El campo de busqueda esta vacio.");
            }
        }
    }

}

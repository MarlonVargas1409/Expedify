package controlador;

import modelo.RegistroExpediente;
import modelo.RegistroExpedienteDAO;
import vista.RegistrarExpediente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;

public class ControladorRE implements ActionListener {
    private final RegistroExpedienteDAO dao;
    private final RegistrarExpediente vista;

    public ControladorRE(RegistrarExpediente vista) {
        this.vista = vista;
        this.dao = new RegistroExpedienteDAO();
        // Asociar eventos a los botones
        this.vista.btnAgregarEX.addActionListener(this);
        this.vista.btnModificarEX.addActionListener(this);
        this.vista.btnEliminarEX.addActionListener(this);
        this.vista.btnBuscarEX.addActionListener(this);
        this.vista.btnCancelarEX.addActionListener(this);
        this.vista.btnSalirEX.addActionListener(this);
        listarExpedientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregarEX) {
            registrarExpediente();
        } else if (e.getSource() == vista.btnModificarEX) {
            modificarExpediente();
        } else if (e.getSource() == vista.btnEliminarEX) {
            eliminarExpediente();
        } else if (e.getSource() == vista.btnBuscarEX) {
            buscarExpediente();
        } else if (e.getSource() == vista.btnCancelarEX) {
            cancelarAccion();
        } else if (e.getSource() == vista.btnSalirEX) {
            salirAplicacion();
        }
    }

    private void registrarExpediente() {
        try {
            RegistroExpediente r = new RegistroExpediente();
            r.setExpediente(vista.txtExpedienteEX.getText());
            r.setTipo_expediente(vista.menuTipoEX.getSelectedItem().toString());
            r.setTribunal(vista.menuTribunal.getSelectedItem().toString());
            r.setSala(vista.menuSala.getSelectedItem().toString());
            r.setPropietario(vista.txtPropietarioEX.getText());
            r.setFecha(new java.util.Date()); // Fecha actual
            dao.registrar(r);
            JOptionPane.showMessageDialog(null, "Expediente registrado exitosamente.");
            listarExpedientes();
            limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar expediente: " + ex.getMessage());
        }
    }

    private void listarExpedientes() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) vista.tablaEX.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            List<RegistroExpediente> lista = dao.listar();
            for (RegistroExpediente r : lista) {
                modelo.addRow(new Object[]{r.getExpediente(), r.getTipo_expediente(), r.getTribunal(),
                        r.getSala(), r.getPropietario(), r.getFecha()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar expedientes: " + ex.getMessage());
        }
    }

    private void buscarExpediente() {
        try {
            String buscar = vista.txtBuscarEX.getText();
            DefaultTableModel modelo = (DefaultTableModel) vista.tablaEX.getModel();
            modelo.setRowCount(0); // Limpiar tabla
            List<RegistroExpediente> lista = dao.buscarExpediente(buscar);
            for (RegistroExpediente r : lista) {
                modelo.addRow(new Object[]{r.getExpediente(), r.getTipo_expediente(), r.getTribunal(),
                        r.getSala(), r.getPropietario(), r.getFecha()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar expediente: " + ex.getMessage());
        }
    }

    private void modificarExpediente() {
        try {
            int fila = vista.tablaEX.getSelectedRow();
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Seleccione un expediente para modificar.");
                return;
            }
            RegistroExpediente r = new RegistroExpediente();
            r.setExpediente(vista.txtExpedienteEX.getText());
            r.setTipo_expediente(vista.menuTipoEX.getSelectedItem().toString());
            r.setTribunal(vista.menuTribunal.getSelectedItem().toString());
            r.setSala(vista.menuSala.getSelectedItem().toString());
            r.setPropietario(vista.txtPropietarioEX.getText());
            r.setFecha(new java.util.Date());
            dao.actualizar(r);
            JOptionPane.showMessageDialog(null, "Expediente modificado exitosamente.");
            listarExpedientes();
            limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar expediente: " + ex.getMessage());
        }
    }

    private void eliminarExpediente() {
        try {
            int fila = vista.tablaEX.getSelectedRow();
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Seleccione un expediente para eliminar.");
                return;
            }
            int id = Integer.parseInt(vista.tablaEX.getValueAt(fila, 0).toString()); // Asume que hay un campo ID
            dao.eliminar(id);
            JOptionPane.showMessageDialog(null, "Expediente eliminado exitosamente.");
            listarExpedientes();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar expediente: " + ex.getMessage());
        }
    }

    private void cancelarAccion() {
        limpiarCampos();
        JOptionPane.showMessageDialog(null, "Acción cancelada.");
    }

    private void salirAplicacion() {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void limpiarCampos() {
        vista.txtExpedienteEX.setText("");
        vista.menuTipoEX.setSelectedIndex(0);
        vista.menuTribunal.setSelectedIndex(0);
        vista.menuSala.setSelectedIndex(0);
        vista.txtPropietarioEX.setText("");
        vista.txtBuscarEX.setText("");
    }
}
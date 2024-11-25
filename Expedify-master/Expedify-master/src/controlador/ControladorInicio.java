
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.InicioVista;
import vista.RegistrarCaja;
import vista.RegistrarExpediente;

public class ControladorInicio implements ActionListener {
    private final InicioVista vista;

    public ControladorInicio(InicioVista vista) {
        this.vista = vista;  // Asignar la instancia de la vista
        this.vista.btnRegistrarCA.addActionListener(this);
        this.vista.btnRegistrarEX.addActionListener(this);

        this.vista.btnRegistrarCA.setEnabled(true);
        this.vista.btnRegistrarEX.setEnabled(true);
    }

    // Método para abrir la ventana de expediente
    public void abrirVistaExpediente() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        RegistrarExpediente registrarExpediente = new RegistrarExpediente();
    new ControladorRE(registrarExpediente); // Controlador de Registrar Expediente
    registrarExpediente.setVisible(true);
    registrarExpediente.setLocationRelativeTo(null);
    vista.dispose(); // Cierra 
    }

    // Método para abrir la ventana de caja
    public void abrirVistaCaja() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        RegistrarCaja registrarCaja = new RegistrarCaja();
    new ControladorRC(registrarCaja); // Controlador de Registrar Caja
    registrarCaja.setVisible(true);
    registrarCaja.setLocationRelativeTo(null);
    vista.dispose(); // Cierra la vista de inicio
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Si el botón presionado es btnRegistrarCA (Registrar Caja)
        if (e.getSource() == vista.btnRegistrarCA) {
            try {
                abrirVistaCaja();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        // Si el botón presionado es btnRegistrarEX (Registrar Expediente)
        else if (e.getSource() == vista.btnRegistrarEX) {
            try {
                abrirVistaExpediente();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.InicioVista;
import vista.RegistrarCaja;
import vista.RegistrarExpediente;

/**
 ** @author Marlon Vargas
*
 */
public class ControladorInicio {

    private InicioVista inicioVista;

    public ControladorInicio(InicioVista inicioVista) {
        this.inicioVista = inicioVista;

        this.inicioVista.agregarListenerExpediente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVistaExpediente();
            }
        });

        this.inicioVista.agregarListenerCaja(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    abrirVistaCaja();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        this.inicioVista.setVisible(true);
    }

    private void abrirVistaExpediente() {
        RegistrarExpediente registrarExpediente = new RegistrarExpediente();
        ControladorRE controladorRE = new ControladorRE(registrarExpediente);
        inicioVista.dispose(); // Cierra la vista actual.
    }

    private void abrirVistaCaja() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        RegistrarCaja registrarCaja = new RegistrarCaja();
        ControladorRC controladorRC = new ControladorRC(registrarCaja);
        inicioVista.dispose(); // Cierra la vista actual.
    }
}

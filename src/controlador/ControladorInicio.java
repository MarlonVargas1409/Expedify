
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


import controlador.ControladorLogin;
import vista.LoginVista;

/**
 ** @author Marlon Vargas
*
 */
public class Main {

    public static void main(String args[]) {
        LoginVista lv = new LoginVista();
        ControladorLogin cl = new ControladorLogin(lv);
        lv.setVisible(true);
        lv.setLocationRelativeTo(null);
    }
}

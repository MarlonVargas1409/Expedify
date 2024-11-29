
import controlador.ControladorLogin;
import vista.LoginV;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jquezada
 */
public class Agenda {

    public static void main(String args[]) {
        LoginV lv = new LoginV();
        ControladorLogin cl = new ControladorLogin(lv);
        lv.setVisible(true);
        lv.setLocationRelativeTo(null);
    }
}

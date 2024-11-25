package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.LoginDAO;
import modelo.Login;
import vista.LoginVista;
import vista.InicioVista;

/**
 ** @author Marlon Vargas
 *
 */
    public class ControladorLogin implements ActionListener {

    LoginDAO dao = new LoginDAO();
    Login l = new Login();
    LoginVista loginv = new LoginVista();

    public ControladorLogin(LoginVista l) {
        this.loginv = l;
        this.loginv.btnEntrar.addActionListener(this);
    }

    private boolean validarCampos(LoginVista l) {
        if (l.txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "El campo de usuario no debe estar vacio!", "Error!", JOptionPane.ERROR_MESSAGE);
            l.txtUsuario.requestFocus();
            return false;
        }
        if (l.txtContrasena.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "El campo de clave no debe estar vacio!", "Error!", JOptionPane.ERROR_MESSAGE);
            l.txtContrasena.requestFocus();
            return false;
        }
        return true;
    }
    
    private void limpiarCampos(LoginVista l) {
        l.txtUsuario.setText("");
        l.txtContrasena.setText("");
        l.txtUsuario.requestFocus();
    }
    
    public boolean AccionarLogin(String usuario, String contrasena, LoginVista login) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
        if (validarCampos(login)) {
            System.out.println("campos del formulario validados que no esten vacios!");
            try {
                System.out.println("verificando si los datos existen!");
                if (dao.Login(usuario, contrasena)) {
                    JOptionPane.showMessageDialog(loginv, "Ingresado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    login.setVisible(false);
                    login.dispose();
                    
                    InicioVista v = new InicioVista();
                    v.setVisible(true);
                    v.setLocationRelativeTo(null);
                 
                  
                    return true;
                } else {
                    JOptionPane.showMessageDialog(login, "Error al tratar de ingresar.\n El usuario o la clave estan incorrectos!", "Error!", JOptionPane.ERROR_MESSAGE);
                    limpiarCampos(login);
                    return false;
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(loginv, "Error al tratar de ingresar: " + e, "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Validando si se presiono la tecla de ingreso
        if (e.getSource() == loginv.btnEntrar) {
            String usuario = loginv.txtUsuario.getText();
            String contrasena = loginv.txtContrasena.getText();
            //String contrasena = loginv.txtContrasena.getText();
            try {
                AccionarLogin(usuario, contrasena, loginv);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

package controlador;
import javax.swing.JOptionPane;
import modelo.LoginDAO;
import modelo.Login;
import vista.LoginVista;
import vista.InicioVista;
import java.security.spec.InvalidKeySpecException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ControladorLogin {
    private final LoginDAO dao;
    private final Login usuario;

    public ControladorLogin(LoginDAO dao, Login usuario) {
        this.dao = dao;
        this.usuario = usuario;
    }

    public boolean autenticar(String username, String password) {
        try {
            // Verificar si el usuario es "administrador"
            if (!"administrador".equalsIgnoreCase(username)) {
                JOptionPane.showMessageDialog(null, "Solo el administrador puede iniciar sesión.");
                return false;
            }

            // Encriptar la contraseña ingresada
            String encryptedPassword = encriptarContraseña(password);

            // Lógica para autenticar al usuario
            if (dao.Login(username, encryptedPassword)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al autenticar: " + e.getMessage());
            return false;
        }
    }

    public String encriptarContraseña(String password) {
        try {
            // Crear instancia de MessageDigest para SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Aplicar hashing a la contraseña y obtener el array de bytes
            byte[] encodedHash = digest.digest(password.getBytes());

            // Convertir los bytes en una representación hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al encriptar la contraseña: " + e.getMessage());
        }
    }
}
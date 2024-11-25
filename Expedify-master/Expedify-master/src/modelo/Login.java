
package modelo;


public class Login {
    
    //declarar las variables que utilizaremos para el login
    private int id;
    private String usuario;
    private String contraseña;
    
    //Estos son los constructores vacio y con parametros

    public Login() {
    }

    public Login(int id, String usuario, String contraseña) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    
    //definimos los getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}



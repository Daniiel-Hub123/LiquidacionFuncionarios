
package gobernacion.modelo;


public class Usuario extends Rol {
    
    private int id_usuario;
    private String usuario;
    private String contrasenia;

    public Usuario(int id_usuario, String usuario, String contrasenia) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Usuario(int id_usuario, String usuario, String contrasenia, int id_rol, String cargo) {
        super(id_rol, cargo);
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    

    public Usuario(int id_usuario, String usuario, String contrasenia, int id_rol) {
        super(id_rol);
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Usuario(int id_usuario, String usuario, String contrasenia, int id_rol, String cargo, String ocupacion) {
        super(id_rol, cargo, ocupacion);
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    

    public Usuario() {
    }

    public Usuario(int id_rol,String contrasenia) {
        super.setId_rol(id_rol);
        this.contrasenia = contrasenia;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }
    
    
    
    
    
    
}

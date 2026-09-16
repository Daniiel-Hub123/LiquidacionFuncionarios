
package gobernacion.modelo;


public class Persona  extends Usuario{
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private boolean tipo;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, String correo, int id_usuario, String usuario, String contrasenia, int id_rol, String cargo, String ocupacion) {
        super(id_usuario, usuario, contrasenia, id_rol, cargo, ocupacion);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, String correo, boolean tipo, int id_usuario, String usuario, String contrasenia, int id_rol, String cargo, String ocupacion) {
        super(id_usuario, usuario, contrasenia, id_rol, cargo, ocupacion);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo = tipo;
    }
    



    public Persona(String cedula) {
        this.cedula = cedula;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}

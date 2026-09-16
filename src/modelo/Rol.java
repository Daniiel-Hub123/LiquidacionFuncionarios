
package gobernacion.modelo;


public class Rol {
    
    private int id_rol;
    private String cargo;
    private String ocupacion;

    public Rol() {
    }

    public Rol(int id_rol, String cargo) {
        this.id_rol = id_rol;
        this.cargo = cargo;
    }

    public Rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public Rol(int id_rol, String cargo, String ocupacion) {
        this.id_rol = id_rol;
        this.cargo = cargo;
        this.ocupacion = ocupacion;
    }
    
    

  

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    
    
    
    
    
}

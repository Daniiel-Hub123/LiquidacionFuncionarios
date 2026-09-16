/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion.modelo;

/**
 *
 * @author Mis Documentos
 */
public class Cuenta extends Persona { 
    
    private int id_cuenta;

    public Cuenta(int id_cuenta, String cedula, String nombre, String apellido, String telefono, String correo, int id_usuario, String usuario, String contrasenia, int id_rol, String cargo, String ocupacion) {
        super(cedula, nombre, apellido, telefono, correo, id_usuario, usuario, contrasenia, id_rol, cargo, ocupacion);
        this.id_cuenta = id_cuenta;
    }

    public Cuenta() {
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    
    
    
}

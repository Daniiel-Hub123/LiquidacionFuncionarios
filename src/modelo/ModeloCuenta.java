/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion.modelo;

import modelo.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mis Documentos
 */
public class ModeloCuenta extends Cuenta{
    
    private static ConexionPG conectar = new ConexionPG();

    public ModeloCuenta() {
    }

    public ModeloCuenta(int id_cuenta, String cedula, String nombre, String apellido, String telefono, String correo, int id_usuario, String usuario, String contrasenia, int id_rol, String cargo, String ocupacion) {
        super(id_cuenta, cedula, nombre, apellido, telefono, correo, id_usuario, usuario, contrasenia, id_rol, cargo, ocupacion);
    }
    
    
        public static List<Cuenta> ListarCuenta(String aguja){
        
                try {
            String query = "SELECT * FROM persona p,usuario u,rol_persona r,rol ro WHERE ";
            
            query += "UPPER(nombre) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(apellido) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(telefono) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(correo) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(id_usuario) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(username) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(contrasenia) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(id_rol) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(cargo) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(ocupacion) LIKE UPPER('%" + aguja + "%') ";
            query += "ORDER BY (cedula)";

            ResultSet rs = conectar.query(query);
            List<Cuenta> lista = new ArrayList<Cuenta>();
            
            while (rs.next()) {

                Cuenta cuenta = new Cuenta();
                cuenta.setCedula(rs.getString("cedula"));
                cuenta.setNombre(rs.getString("nombre"));
                cuenta.setApellido(rs.getString("apellido"));
                cuenta.setTelefono(rs.getString("telefono"));
                cuenta.setCorreo(rs.getString("correo"));
                cuenta.setId_usuario(rs.getInt("id_usuario"));
                cuenta.setUsuario(rs.getString("username"));
                cuenta.setContrasenia(rs.getString("contraseña"));
                cuenta.setId_rol(rs.getInt("id_rol"));
                cuenta.setCargo(rs.getString("cargo"));
                cuenta.setOcupacion(rs.getString("ocupacion"));


                lista.add(cuenta);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCuenta.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
                public boolean grabar() {
        String sql;
        sql = "INSERT INTO clientes(cedula, nombre, apellido, telefono, correo,id_usuario,username,contraseña,id_rol,cargo,ocupacion)";
        sql += "VALUES('"+ getCedula()+"','" + getNombre() + "','" + getApellido() + "','" + getTelefono()+ "','" + getCorreo()+ "','" + getId_usuario()+ "','" + getUsuario()+ "','" + getContrasenia()+ "','" + getId_rol()+ "','" + getCargo()+ "','" + getOcupacion()+ "')";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
                
                public List<Cuenta> buscarEditar() {
        try {
            String query = "select * from persona p,usuario u,rol_persona r,rol ro where cedula='" + getCedula()+ "';";
            ResultSet rs = conectar.query(query);
            List<Cuenta> lista = new ArrayList<Cuenta>();
            
            while (rs.next()) {
                Cuenta cuenta = new Cuenta();
      
                cuenta.setCedula(rs.getString("cedula"));
                cuenta.setNombre(rs.getString("nombre"));
                cuenta.setApellido(rs.getString("apellido"));
                cuenta.setTelefono(rs.getString("telefono"));
                cuenta.setCorreo(rs.getString("correo"));
                cuenta.setId_usuario(rs.getInt("id_usuario"));
                cuenta.setUsuario(rs.getString("username"));
                cuenta.setContrasenia(rs.getString("contraseña"));
                cuenta.setId_rol(rs.getInt("id_rol"));
                cuenta.setCargo(rs.getString("cargo"));
                cuenta.setOcupacion(rs.getString("ocupacion"));
               
                lista.add(cuenta);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCuenta.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean Editar() {
        String sql;
        sql = "UPDATE persona SET nombre='" + getNombre() + "', apellido='" + getApellido() + "',"
                + "telefono='" + getTelefono()+ "', correo='" + getCorreo()+  "', id_usuario='" + getId_usuario()+  "', username='" + getUsuario()+  "', contraseña='" + getContrasenia()+  "', id_rol='" + getId_rol()+  "', cargo='" + getCargo()+  "', ocupacion='" + getOcupacion()+  "'"
                + "WHERE cedula='" + getCedula()+ "';";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {

            return false;
        }
    }
    
     /*public boolean Eliminar() {

        String sql;
        sql = "DELETE FROM persona WHERE cedula='" + getCedula()+ "'";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        */
    
    
}

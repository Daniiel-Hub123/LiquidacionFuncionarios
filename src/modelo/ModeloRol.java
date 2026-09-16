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
public class ModeloRol extends Rol{
    
    private static ConexionPG conectar = new ConexionPG();

    public ModeloRol() {
    }

    public ModeloRol(int id_rol) {
        super(id_rol);
    }

    public ModeloRol(int id_rol, String cargo) {
        super(id_rol, cargo);
    }

    public ModeloRol(int id_rol, String cargo, String ocupacion) {
        super(id_rol, cargo, ocupacion);
    }
    
        
        
         public static List<Rol> ListarRol(String aguja){
        
                try {
            String query = "SELECT * FROM rol WHERE ";
            
            query += "UPPER(cargo) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(ocupacion) LIKE UPPER('%" + aguja + "%') OR ";
            
            query += "ORDER BY (id_rol)";

            ResultSet rs = conectar.query(query);
            List<Rol> lista = new ArrayList<Rol>();
            
            while (rs.next()) {

                Rol rol = new Rol();
                rol.setId_rol(rs.getInt("id_rol"));
                rol.setCargo(rs.getString("cargo"));
                rol.setOcupacion(rs.getString("ocupacion"));

                lista.add(rol);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloRol.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

           public boolean grabar() {
        String sql;
        sql = "INSERT INTO rol(id_rol, cargo)";
        sql += "VALUES('"+ getId_rol()+"','" + getCargo()+ "','" + getOcupacion()+ "')";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
             public List<Rol> buscarEditar() {
        try {
            String query = "select * from rol where id_rol='" + getId_rol()+ "';";
            ResultSet rs = conectar.query(query);
            List<Rol> lista = new ArrayList<Rol>();
            
            while (rs.next()) {
                Rol rol = new Rol();
                rol.setId_rol(rs.getInt("id_rol"));
                rol.setCargo(rs.getString("cargo"));
                rol.setOcupacion(rs.getString("ocupacion"));

                
               
                lista.add(rol);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloRol.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean Editar() {
        String sql;
        sql = "UPDATE rol SET cargo='" + getCargo()+  "', ocupacion='" + getOcupacion()+  "'"
                + "WHERE cedula='" + getId_rol()+ "';";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {

            return false;
        }
    }
    
     /*public boolean Eliminar() {

        String sql;
        sql = "DELETE FROM rol WHERE id_rol='" + getId_rol()+ "'";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        */
           
           
    
    
    
    
    
}

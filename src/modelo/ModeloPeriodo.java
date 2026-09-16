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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mis Documentos
 */
public class ModeloPeriodo extends periodo {
    
      private static ConexionPG conectar = new ConexionPG();

    public ModeloPeriodo() {
    }

    public ModeloPeriodo(int id_periodo) {
        super(id_periodo);
    }

    public ModeloPeriodo(int id_periodo, int dias_tomados, int dias_derecho, int dias_pendientes, Date fecha_ingreso, Date fecha_salida, Date fecha_reingreso) {
        super(id_periodo, dias_tomados, dias_derecho, dias_pendientes, fecha_ingreso, fecha_salida, fecha_reingreso);
    }
      
       public static List<periodo> ListarPeriodo(String aguja){
        
                try {
            String query = "SELECT * FROM periodo WHERE ";
            
            query += "UPPER(dias_tomados) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(dias_derecho) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(dias_pendientes) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(fecha_ingreso) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(fecha_salida) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(fecha_reingreso) LIKE UPPER('%" + aguja + "%') ";
            
            query += "ORDER BY (id_periodo)";

            ResultSet rs = conectar.query(query);
            List<periodo> lista = new ArrayList<periodo>();
            
            while (rs.next()) {

                periodo periodo1 = new periodo();
                periodo1.setId_periodo(rs.getInt("id_periodo"));
                periodo1.setDias_tomados(rs.getInt("dias_tomados"));
                periodo1.setDias_derecho(rs.getInt("dias_derecho"));
                periodo1.setDias_pendientes(rs.getInt("dias_pendientes"));
                periodo1.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                periodo1.setFecha_salida(rs.getDate("fecha_salida"));
                periodo1.setFecha_reingreso(rs.getDate("fecha_reingreso"));
                


                lista.add(periodo1);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPeriodo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public boolean grabar() {
        String sql;
        sql = "INSERT INTO periodo( id_periodo,  dias_tomados,  dias_derecho,  dias_pendientes,  fecha_ingreso,  fecha_salida, fecha_reingreso)";
        sql += "VALUES('"+ getId_periodo()+"','" + getDias_tomados()+ "','" + getDias_derecho()+ "','" + getDias_pendientes()+ "','" + getFecha_ingreso()+ "','" + getFecha_salida()+ "','" + getFecha_reingreso()+ "')";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
          public List<periodo> buscarEditar() {
        try {
            String query = "select * from periodo where id_periodo='" + getId_periodo()+ "';";
            ResultSet rs = conectar.query(query);
            List<periodo> lista = new ArrayList<periodo>();
            
            while (rs.next()) {
                periodo periodo1 = new periodo();
                periodo1.setId_periodo(rs.getInt("id_periodo"));
                periodo1.setDias_tomados(rs.getInt("dias_tomados"));
                periodo1.setDias_derecho(rs.getInt("dias_derecho"));
                periodo1.setDias_pendientes(rs.getInt("dias_pendientes"));
                periodo1.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                periodo1.setFecha_salida(rs.getDate("fecha_salida"));
                periodo1.setFecha_reingreso(rs.getDate("fecha_reingreso"));

                
               
                lista.add(periodo1);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPeriodo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean Editar() {
        String sql;
        sql = "UPDATE periodo SET dias_tomados='" + getDias_tomados()+ "', dias_derecho='" + getDias_derecho()+ "',"
                + "dias_pendientes='" + getDias_pendientes()+ "', fecha_ingreso='" + getFecha_ingreso()+  "'"
                + "fecha_salida='" + getFecha_salida()+ "', fecha_reingreso='" + getFecha_reingreso()+  "'"
             
                + "WHERE id_periodo='" + getId_periodo()+ "';";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {

            return false;
        }
    }
    
     /*public boolean Eliminar() {

        String sql;
        sql = "DELETE FROM periodo WHERE id_periodo='" + getId_periodo()+ "'";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        */
     
}

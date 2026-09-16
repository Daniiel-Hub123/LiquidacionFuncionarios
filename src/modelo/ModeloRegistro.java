
package gobernacion.modelo;

import modelo.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModeloRegistro extends Registro{
    private static ConexionPG conectar = new ConexionPG();

    public ModeloRegistro() {
    }

    public ModeloRegistro(int id_registro) {
        super(id_registro);
    }

    public ModeloRegistro(int id_registro, Date horas_extras, Date tiempo_receso, Date fechas_actual, Date hora_ingreso, Date hora_salida, Date hora_ingreso_permiso, Date hora_salida_permiso) {
        super(id_registro, horas_extras, tiempo_receso, fechas_actual, hora_ingreso, hora_salida, hora_ingreso_permiso, hora_salida_permiso);
    }
    public static List<Registro> ListarRegistro(String aguja){
        
                try {
            String query = "SELECT * FROM registro WHERE ";
            
            query += "UPPER(horas_extras) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(tiempo_receso) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(fecha_actual) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(hora_ingreso) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(hora_salida) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(hora_ingreso_permiso) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(hora_salida_permiso) LIKE UPPER('%" + aguja + "%') ";
            
            query += "ORDER BY (id_registro)";

            ResultSet rs = conectar.query(query);
            List<Registro> lista = new ArrayList<Registro>();
            
            while (rs.next()) {

                Registro registro = new Registro();
                registro.setId_registro(rs.getInt("id_registro"));
                registro.setHoras_extras(rs.getDate("horas_extras"));
                registro.setTiempo_receso(rs.getDate("tiempo_receso"));
                registro.setFecha_actual(rs.getDate("fecha_actual"));
                registro.setHora_ingreso(rs.getDate("hora_ingreso"));
                registro.setHora_salida(rs.getDate("hora_salida"));
                registro.setHora_ingreso_permiso(rs.getDate("hora_ingreso_permiso"));
                registro.setHora_salida_permiso(rs.getDate("hora_salida_permiso"));
                


                lista.add(registro);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloRegistro.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
     public boolean grabar() {
        String sql;
        sql = "INSERT INTO registro(id_registro, horas_extras, tiempo_receso, fecha_actual, hora_ingreso,hora_salida,hora_ingreso_permiso,hora_salida_permiso)";
        sql += "VALUES('"+ getId_registro()+"','" + getHoras_extras()+ "','" + getTiempo_receso()+ "','" + getFecha_actual()+ "','" + getHora_ingreso()+ "','" + getHora_salida()+ "','" + getHora_ingreso_permiso()+ "','" + getHora_salida_permiso()+ "')";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
     
      public List<Registro> buscarEditar() {
        try {
            String query = "select * from registro where id_registro='" + getId_registro()+ "';";
            ResultSet rs = conectar.query(query);
            List<Registro> lista = new ArrayList<Registro>();
            
            while (rs.next()) {
                Registro registro = new Registro();
                registro.setId_registro(rs.getInt("id_registro"));
                registro.setHoras_extras(rs.getDate("horas_extras"));
                registro.setTiempo_receso(rs.getDate("tiempo_receso"));
                registro.setFecha_actual(rs.getDate("fecha_actual"));
                registro.setHora_ingreso(rs.getDate("hora_ingreso"));
                registro.setHora_salida(rs.getDate("hora_salida"));
                registro.setHora_ingreso_permiso(rs.getDate("hora_ingreso_permiso"));
                registro.setHora_salida_permiso(rs.getDate("hora_salida_permiso"));

                
               
                lista.add(registro);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloRegistro.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean Editar() {
        String sql;
        sql = "UPDATE registro SET horas_extras='" + getHoras_extras()+ "', tiempo_receso='" + getTiempo_receso()+ "',"
                + "fecha_actual='" + getFecha_actual()+ "', hora_ingreso='" + getHora_ingreso()+  "'"
                + "hora_salida='" + getHora_salida()+ "', hora_ingreso_permiso='" + getHora_ingreso_permiso()+  "'"
                + "hora_salida_permiso='" + getHora_salida_permiso()+ "'"
                + "WHERE id_registro='" + getId_registro()+ "';";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {

            return false;
        }
    }
    
     /*public boolean Eliminar() {

        String sql;
        sql = "DELETE FROM registro WHERE id_registro='" + getId_registro()+ "'";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        */
    
    
}


package gobernacion.modelo;


import modelo.ConexionPG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModeloPersona extends Persona {
    
    private static ConexionPG conectar = new ConexionPG();

    public ModeloPersona() {
    }

    public ModeloPersona(String cedula) {
        super(cedula);
    }

    public ModeloPersona(String cedula, String nombre, String apellido, String telefono, String correo) {
        super(cedula, nombre, apellido, telefono, correo);
    }

    public ModeloPersona(String cedula, String nombre, String apellido, String telefono, String correo, boolean tipo, int id_usuario, String usuario, String contrasenia, int id_rol, String cargo, String ocupacion) {
        super(cedula, nombre, apellido, telefono, correo, tipo, id_usuario, usuario, contrasenia, id_rol, cargo, ocupacion);
    }
    
    
    //
    
    
    public static List<Persona> ListarPersona(String aguja){
        
                try {
            String query = "SELECT * FROM persona WHERE ";
            
            query += "UPPER(nombre) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(apellido) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(telefono) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(correo) LIKE UPPER('%" + aguja + "%') OR ";
            query += "UPPER(tipo) LIKE UPPER('%" + aguja + "%') ";
            
            query += "ORDER BY (cedula)";

            ResultSet rs = conectar.query(query);
            List<Persona> lista = new ArrayList<Persona>();
            
            while (rs.next()) {

                Persona persona = new Persona();
                persona.setCedula(rs.getString("cedula"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setTipo(rs.getBoolean("tipo"));


                lista.add(persona);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
        public boolean grabar() {
        String sql;
        sql = "INSERT INTO clientes(cedula, nombre, apellido, telefono, correo,tipo)";
        sql += "VALUES('"+ getCedula()+"','" + getNombre() + "','" + getApellido() + "','" + getTelefono()+ "','" + getCorreo()+ "','" + getTipo()+ "')";
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
        
        public List<Persona> buscarEditar() {
        try {
            String query = "select * from persona where cedula='" + getCedula()+ "';";
            ResultSet rs = conectar.query(query);
            List<Persona> lista = new ArrayList<Persona>();
            
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setCedula(rs.getString("cedula"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setTipo(rs.getBoolean("tipo"));

                
               
                lista.add(persona);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean Editar() {
        String sql;
        sql = "UPDATE persona SET nombre='" + getNombre() + "', apellido='" + getApellido() + "',"
                + "telefono='" + getTelefono()+ "', correo='" + getCorreo()+  "'"+ getTipo()+  "'"
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
    
    


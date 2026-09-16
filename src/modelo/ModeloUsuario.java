/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion.modelo;

import modelo.ConexionPG;
import java.sql.ResultSet;

/**
 *
 * @author Mis Documentos
 */
public class ModeloUsuario extends Usuario {
    
     private static ConexionPG con = new ConexionPG();
    
   
     
    public ModeloUsuario(int id_usuario, String usuario, String contrasenia) {
        super(id_usuario, usuario, contrasenia);
    }

    public ModeloUsuario(int id_usuario) {
        super(id_usuario);
    }

    public ModeloUsuario(int id_rol, String contrasenia) {
        super(id_rol, contrasenia);
    }

    public ModeloUsuario(int id_usuario, String usuario, String contrasenia, int id_rol, String cargo) {
        super(id_usuario, usuario, contrasenia, id_rol, cargo);
    }

    public ModeloUsuario(int id_usuario, String usuario, String contrasenia, int id_rol, String cargo, String ocupacion) {
        super(id_usuario, usuario, contrasenia, id_rol, cargo, ocupacion);
    }

    public ModeloUsuario() {
    }
    public boolean IniciarSesion() {
        boolean comprobar = false;

        try {
            String sql;
            sql = "SELECT id_rol, contrasenia\n"
                    + "FROM usuario \n"
                    + "where id_rol='"+getId_rol()+"' and contrasenia='"+getContrasenia()+"';";

            ResultSet rs = con.query(sql);
            while (rs.next()) {
                System.out.println("USUARIO" + getId_rol()+ "INICIO SESION");
                comprobar = true;
            }

        } catch (Exception e) {
            comprobar = false;
        }
        return comprobar;
    }

  
    
    
    
    
}

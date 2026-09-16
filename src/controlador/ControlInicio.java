/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import gobernacion.modelo.ModeloCuenta;
import gobernacion.modelo.ModeloUsuario;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import vista.Clave;
import vista.Inicio;
import vista.Login;


import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import vista.Registro;
/**
 *
 * @author ASUS
 */
public class ControlInicio {
    
 public   Inicio principal;
 public   Login l;
  public  Clave pass;
  public  Registro register;
  public  ModeloCuenta user;
  public  ModeloUsuario u;
    
    public ControlInicio(Inicio principal, Login l,Clave pass,Registro register,ModeloCuenta user,ModeloUsuario u) {
        this.principal = principal;
        this.l = l;
        this.pass = pass;
        this.register = register;
        this.user = user;
        this.u = u;
        principal.setVisible(true);
        principal.setTitle("CALCULO DE VACACIONES");
        principal.getBtninicio().setBackground(new Color(248,217,217));
        principal.getBtnregister().setBackground(new Color(248,217,217));
        principal.getContentPane().setBackground(new Color(229,230,242));
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        
    }
    

    
    
    public void iniciaControl() {

        principal.getBtninicio().addActionListener(l -> inicioSesion());
        principal.getBtnregister().addActionListener(l-> Seguridad());
        
        
    }
    
    
    
        public void inicioSesion() {

      
        principal.setVisible(false);
        l.setVisible(true);  
        ControlLogin c = new ControlLogin(u,l,principal,pass,user,register);
        c.IniciarControl();
    }
    
    
    
        public void Seguridad(){
        
                       
            principal.setVisible(false);
            ControlClave cl = new ControlClave(pass,l,principal,register, user,u);
            cl.inicioControl();
            
        }
        
        
        
    
        
         
}

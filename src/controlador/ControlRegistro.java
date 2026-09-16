/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import gobernacion.modelo.ModeloCuenta;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.Clave;
import vista.Inicio;
import vista.Login;
import vista.Registro;
import gobernacion.modelo.ModeloUsuario;

/**
 *
 * @author ASUS
 */
public class ControlRegistro {
    
    
    public   Registro register;
    public   ModeloCuenta account;
    public    Login acceso;
    public   Inicio inicio;
    public  Clave pass;
    public  ModeloUsuario user;

    public ControlRegistro(Registro register, ModeloCuenta account,Inicio inicio,Clave pass,ModeloUsuario user,Login acceso) {
        this.register = register;
        this.account = account;
        this.inicio = inicio;
        this.pass = pass;
        this.user = user;
        this.acceso = acceso;
        register.setTitle("ALMACENAR USUARIO");
        register.setLocationRelativeTo(null);
        register.getBtnregistrar().setBackground(new Color(248,217,217));
        register.getContentPane().setBackground(new Color(229,230,242));
        register.getTxtcargo().setLineWrap(true);
        register.getTxtcargo().setWrapStyleWord(true);
        register.setVisible(true);
        
    }
    
    
    
    public void inicioControl(){
    
      
        
            register.getBtnregresar().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                    
                    regresar();
                    
                    
                }
            
            
            });
    
    
    
    }
    
    
    
    public void regresar(){
    

        register.setVisible(false);
        inicio.setVisible(true);
        ControlInicio cl = new ControlInicio(inicio,acceso,pass,register,account,user);
        cl.iniciaControl();
        
        
        
    
    }
    
    
}

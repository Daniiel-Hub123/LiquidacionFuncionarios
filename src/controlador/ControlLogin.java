/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import gobernacion.modelo.ModeloCuenta;
import gobernacion.modelo.ModeloUsuario;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.Clave;
import vista.Inicio;
import vista.Login;
import vista.Registro;

/**
 *
 * @author ASUS
 */
public class ControlLogin {
    
    
    public ModeloUsuario user;
    public Login acceso;
    public Inicio inicio;
    public Clave pass;
    public ModeloCuenta cuenta;
    public Registro register;

    public ControlLogin(ModeloUsuario user, Login acceso, Inicio inicio,Clave pass,ModeloCuenta cuenta, Registro register) {
        this.user = user;
        this.acceso = acceso;
        this.inicio = inicio;
        this.pass = pass;
        this.cuenta = cuenta;
        this.register = register;
        acceso.setVisible(true);
        acceso.setTitle("SISTEMA");
        acceso.setLocationRelativeTo(null);
        acceso.getBtnacceder().setBackground(new Color(248,217,217));
        acceso.getContentPane().setBackground(new Color(229,230,242));
    }
    

    
    public void IniciarControl() {
        acceso.getBtnacceder().addActionListener(l -> Ingresar());
        acceso.getBtnregresar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                
                backInicio();
                
            }

        
        });
        
        
        
    }
    
    public void Ingresar(){
    
        
        
    
    }
    
    
    public void backInicio(){
 
        acceso.setVisible(false);
        inicio.setVisible(true);
        ControlInicio cl = new ControlInicio(inicio,acceso,pass,register,cuenta,user);
        cl.iniciaControl();
        

    }
    
    
}

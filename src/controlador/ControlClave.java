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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;
import modelo.Seguridad;
import vista.Clave;
import vista.Inicio;
import vista.Login;
import vista.Registro;

/**
 *
 * @author ASUS
 */
public class ControlClave {
    
    public Clave vista;
    public Login log ;
    public Inicio inicio;
    public Registro register;
    public ModeloCuenta user;
    public ModeloUsuario mu;
    
    public ControlClave( Clave vista, Login log, Inicio inicio,Registro register, ModeloCuenta user, ModeloUsuario mu) {
        this.vista = vista;
        this.log = log;
        this.inicio = inicio;
        this.register = register;
        this.user = user;
        this.mu = mu;
        vista.setTitle("SEGURIDAD");
        vista.setLocationRelativeTo(null);
        vista.getBtncont().setBackground(new Color(248,217,217));
        vista.getContentPane().setBackground(new Color(229,230,242));
        vista.getTxtclave().setHorizontalAlignment((int) CENTER_ALIGNMENT);
        vista.setVisible(true);
    }
    
    
    
    
    public void inicioControl(){
    
    
        vista.getBtncont().addActionListener(l-> Confirmar());
        vista.getBtnregresar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                
                backInicio();
                
                
            }
        
        
        
        
        });
        
        
    
    }

    private void Confirmar() {
         
            try{
        
            final String claveEncriptacion = "secreto!";            
            String datosOriginales = "51432GOB";            
            
            Seguridad encriptador = new Seguridad();
            
            String encriptado = encriptador.encriptar(datosOriginales, claveEncriptacion);
            String desencriptado = encriptador.desencriptar(encriptado, claveEncriptacion);

            String pass = vista.getTxtclave().getText();
        
        
            
            
            if(pass.equals(desencriptado)){
                      
                     vista.setVisible(false);
                      ControlRegistro cr = new ControlRegistro(register, user, inicio, vista,mu,log);
                      cr.inicioControl();
            
            
            } else{
            
             JOptionPane.showMessageDialog(vista, "Clave incorrecta, intentenlo de nuevo");  
            }
                
                
                
                
                    } catch(UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(Clave.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        
    }
    
    
    
        
    public void backInicio(){
 
        vista.setVisible(false);

        ControlInicio cl = new ControlInicio(inicio, log,vista,register,user,mu);
        cl.iniciaControl();

    }
    
    
}

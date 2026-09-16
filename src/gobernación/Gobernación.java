/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernación;

import controlador.ControlInicio;
import gobernacion.modelo.ModeloCuenta;
import gobernacion.modelo.ModeloUsuario;
import vista.Clave;
import vista.Inicio;
import vista.Login;
import vista.Registro;

/**
 *
 * @author ASUS
 */
public class Gobernación {

    /*
      PRACTICAS PREPROFESIONALES 
      DANIEL BARROS, ANTHONY CARDENAS
       VACACIONES
    */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inicio principal = new Inicio();

        Login l = new Login();
        
        Clave c = new Clave();
        
        Registro r = new Registro();
        
        ModeloCuenta mc = new ModeloCuenta();
        
        ModeloUsuario mu = new ModeloUsuario();
                
        ControlInicio cu = new ControlInicio(principal,l,c,r,mc,mu);
                
        cu.iniciaControl();
        
    }
    
}

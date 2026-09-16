/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion.modelo;

import java.util.Date;


public class periodo {
    
    private int id_periodo;
    private int dias_tomados;
    private int dias_derecho;
    private int dias_pendientes;
    private Date fecha_ingreso;
    private Date fecha_salida;
    private Date fecha_reingreso;

    public periodo() {
    }

    public periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    public periodo(int id_periodo, int dias_tomados, int dias_derecho, int dias_pendientes, Date fecha_ingreso, Date fecha_salida, Date fecha_reingreso) {
        this.id_periodo = id_periodo;
        this.dias_tomados = dias_tomados;
        this.dias_derecho = dias_derecho;
        this.dias_pendientes = dias_pendientes;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.fecha_reingreso = fecha_reingreso;
    }
    

   

    public int getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    public int getDias_tomados() {
        return dias_tomados;
    }

    public void setDias_tomados(int dias_tomados) {
        this.dias_tomados = dias_tomados;
    }

    public int getDias_derecho() {
        return dias_derecho;
    }

    public void setDias_derecho(int dias_derecho) {
        this.dias_derecho = dias_derecho;
    }

    public int getDias_pendientes() {
        return dias_pendientes;
    }

    public void setDias_pendientes(int dias_pendientes) {
        this.dias_pendientes = dias_pendientes;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_reingreso() {
        return fecha_reingreso;
    }

    public void setFecha_reingreso(Date fecha_reingreso) {
        this.fecha_reingreso = fecha_reingreso;
    }
    
    
    
    
}

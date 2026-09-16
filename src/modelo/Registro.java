
package gobernacion.modelo;

import java.util.Date;


public class Registro {
    
    private int id_registro;
    private Date horas_extras;
    private Date tiempo_receso;
    private Date fecha_actual;
    private Date hora_ingreso;
    private Date hora_salida;
    private Date hora_ingreso_permiso;
    private Date hora_salida_permiso;

    public Registro() {
    }

    public Registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public Registro(int id_registro, Date horas_extras, Date tiempo_receso, Date fecha_actual, Date hora_ingreso, Date hora_salida, Date hora_ingreso_permiso, Date hora_salida_permiso) {
        this.id_registro = id_registro;
        this.horas_extras = horas_extras;
        this.tiempo_receso = tiempo_receso;
        this.fecha_actual = fecha_actual;
        this.hora_ingreso = hora_ingreso;
        this.hora_salida = hora_salida;
        this.hora_ingreso_permiso = hora_ingreso_permiso;
        this.hora_salida_permiso = hora_salida_permiso;
    }
    



    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public Date getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(Date horas_extras) {
        this.horas_extras = horas_extras;
    }

    public Date getTiempo_receso() {
        return tiempo_receso;
    }

    public void setTiempo_receso(Date tiempo_receso) {
        this.tiempo_receso = tiempo_receso;
    }

    public Date getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(Date fechas_actual) {
        this.fecha_actual = fechas_actual;
    }

    public Date getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(Date hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getHora_ingreso_permiso() {
        return hora_ingreso_permiso;
    }

    public void setHora_ingreso_permiso(Date hora_ingreso_permiso) {
        this.hora_ingreso_permiso = hora_ingreso_permiso;
    }

    public Date getHora_salida_permiso() {
        return hora_salida_permiso;
    }

    public void setHora_salida_permiso(Date hora_salida_permiso) {
        this.hora_salida_permiso = hora_salida_permiso;
    }
    
    
}

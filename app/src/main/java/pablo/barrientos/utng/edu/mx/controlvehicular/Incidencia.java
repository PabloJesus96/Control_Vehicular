package pablo.barrientos.utng.edu.mx.controlvehicular;

/**
 * Created by Pablo Barrientos on 27/02/2018.
 */

public class Incidencia {

    private  String tipo;
    private  String descripcion;
    private  String  fecha;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Incidencia(String tipo, String descripcion, String fecha) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
}

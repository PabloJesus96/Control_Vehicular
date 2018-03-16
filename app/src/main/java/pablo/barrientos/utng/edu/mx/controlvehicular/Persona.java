package pablo.barrientos.utng.edu.mx.controlvehicular;

/**
 * Created by Pablo Barrientos on 27/02/2018.
 */

public class Persona {
    private String nombre;
    private String App;
    private String Apm;
    private String Telefono;
    private String Identificador;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return App;
    }

    public void setApp(String app) {
        App = app;
    }

    public String getApm() {
        return Apm;
    }

    public void setApm(String apm) {
        Apm = apm;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }

    public Persona(String nombre, String identificador, String telefono, String apm, String app) {
        this.nombre = nombre;
        Identificador = identificador;
        Telefono = telefono;
        Apm = apm;
        App = app;
    }

    public boolean alta() {
    return  true;
    }

    public  boolean baja() {
    return  true;
    }

    public  boolean actualizar() {
    return  true;
    }

}

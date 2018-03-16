package pablo.barrientos.utng.edu.mx.controlvehicular;

/**
 * Created by Pablo Barrientos on 27/02/2018.
 */

public class Guardia {
    private  String entrada;
    private  String salida;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public Guardia(String entrada) {
        this.entrada = entrada;
    }

    public  boolean resgistroHorario(){
        return  true;
    }

}

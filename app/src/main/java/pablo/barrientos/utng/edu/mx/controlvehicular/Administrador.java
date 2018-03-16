package pablo.barrientos.utng.edu.mx.controlvehicular;

/**
 * Created by Pablo Barrientos on 27/02/2018.
 */

public class Administrador {

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

    public Administrador(String entrada) {
        this.entrada = entrada;
    }
}

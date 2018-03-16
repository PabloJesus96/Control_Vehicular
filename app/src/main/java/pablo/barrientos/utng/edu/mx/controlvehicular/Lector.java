package pablo.barrientos.utng.edu.mx.controlvehicular;

/**
 * Created by Pablo Barrientos on 27/02/2018.
 */

public class Lector extends  Guardia{
    private  String entrada;
    private  String salida;

    public Lector(String entrada) {
        super(entrada);
    }

    public Lector(String entrada, String entrada1, String salida) {
        super(entrada);
        this.entrada = entrada1;
        this.salida = salida;
    }

    @Override
    public String getEntrada() {
        return entrada;
    }

    @Override
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public String getSalida() {
        return salida;
    }

    @Override
    public void setSalida(String salida) {
        this.salida = salida;
    }
}

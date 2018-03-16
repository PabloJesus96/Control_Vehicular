package pablo.barrientos.utng.edu.mx.controlvehicular;

/**
 * Created by Pablo Barrientos on 27/02/2018.
 */

public class Automovilista  {
    public  String identificador;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Automovilista(String identificador) {
        this.identificador = identificador;
    }

    public  boolean registrarse (){
       return  true;
    }

}

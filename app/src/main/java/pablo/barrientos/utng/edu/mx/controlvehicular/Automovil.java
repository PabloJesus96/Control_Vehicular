package pablo.barrientos.utng.edu.mx.controlvehicular;

/**
 * Created by Pablo Barrientos on 27/02/2018.
 */

public class Automovil {
    private  String placas;
    private  String marca;
    private  String color;
    private  String LicenciaConducir;
    private  String tarjetaCir;

    public Automovil(String placas, String marca, String color, String licenciaConducir, String tarjetaCir) {
        this.placas = placas;
        this.marca = marca;
        this.color = color;
        LicenciaConducir = licenciaConducir;
        this.tarjetaCir = tarjetaCir;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenciaConducir() {
        return LicenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        LicenciaConducir = licenciaConducir;
    }

    public String getTarjetaCir() {
        return tarjetaCir;
    }

    public void setTarjetaCir(String tarjetaCir) {
        this.tarjetaCir = tarjetaCir;
    }

    public  boolean registro(){return  true;}
    public  boolean baja (){ return  true;}
}

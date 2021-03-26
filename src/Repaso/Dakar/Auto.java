package Repaso.Dakar;

public class Auto extends Vehiculo{

    public Auto(){
        this.setPeso(1000);
        this.setRuedas(4);
    }

    public Auto(double v, double aceleracion, double aDeGiro, String patente){
        this.setPeso(1000);
        this.setRuedas(4);
        this.setAceleracion(aceleracion);
        this.setVelocidad(v);
        this.setAnguloDeGiro(aDeGiro);
        this.setPatente(patente);
    }
}

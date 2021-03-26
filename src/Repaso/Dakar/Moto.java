package Repaso.Dakar;

public class Moto extends Vehiculo{

    public Moto(){
     this.setPeso(300);
     this.setRuedas(2);
    }

    public Moto(double v, double aceleracion, double aDeGiro, String patente){
        this.setPeso(300);
        this.setRuedas(2);
        this.setAceleracion(aceleracion);
        this.setVelocidad(v);
        this.setAnguloDeGiro(aDeGiro);
        this.setPatente(patente);
    }

}

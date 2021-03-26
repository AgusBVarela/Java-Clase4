package Repaso.Dakar;

import java.util.List;

public class Carrera {
    private double distancia;
    private double premioEnDolares;
    private double nombre;
    private double cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private  SocorristaMoto socorristaMoto = new SocorristaMoto();
    private  SocorristaAuto socorristaAuto = new SocorristaAuto();

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloGiro, String patente){
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos){
            Vehiculo auto = new Auto(velocidad, aceleracion, anguloGiro, patente);
            listaDeVehiculos.add(auto);
        }
    }
    public void darDeAltaMoto(double velocidad, double aceleracion, double anguloGiro, String patente){
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos){
            Vehiculo moto = new Moto(velocidad, aceleracion, anguloGiro, patente);
            listaDeVehiculos.add(moto);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        this.listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String patente){
        this.listaDeVehiculos.removeIf(v -> v.getPatente() == patente);
    }

    public Vehiculo ganador(){
        double max = 0;
        Vehiculo vehiculoGanador = null;
        for(Vehiculo vehiculo: listaDeVehiculos){
            double numerador = vehiculo.getVelocidad() * vehiculo.getAceleracion() *1/2;
            double denominador = vehiculo.getAnguloDeGiro()*(vehiculo.getPeso() - vehiculo.getRuedas() * 100);
            if(max < (numerador/denominador)){
                max = numerador/denominador;
                vehiculoGanador = vehiculo;
            }
        }
        return vehiculoGanador;
    }

    public void socorrerAuto(String patente){
        Vehiculo vehiculoSocorrer = listaDeVehiculos.stream().filter(vehiculo -> patente.equals(vehiculo.getPatente())).findAny().orElse(null);
        socorristaAuto.socorrer((Auto) vehiculoSocorrer);
    }
    public void socorrerMoto(String patente){
        Vehiculo vehiculoSocorrer = listaDeVehiculos.stream().filter(vehiculo -> patente.equals(vehiculo.getPatente())).findAny().orElse(null);
        socorristaMoto.socorrer((Moto) vehiculoSocorrer);
    }
}

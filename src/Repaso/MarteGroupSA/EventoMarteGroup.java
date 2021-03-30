package Repaso.MarteGroupSA;

import java.util.ArrayList;
import java.util.List;

public class EventoMarteGroup {

    List<Invitado> invitados;
    List<FuegoArtificial> fuegosArtificiales;

    public EventoMarteGroup(){
        this.invitados =  new ArrayList<Invitado>();
        this.fuegosArtificiales =  new ArrayList<FuegoArtificial>();
    }

    public void ReventarFuegosArtificiales(){
        for(FuegoArtificial fuegoArtificial : fuegosArtificiales){
            fuegoArtificial.Reventar();
        }
    }

    public void DistribuirTorta(){
        Torta torta = new Torta();
        for(Invitado invitado : invitados){
            invitado.ComerTorta(torta);
        }
    }

}

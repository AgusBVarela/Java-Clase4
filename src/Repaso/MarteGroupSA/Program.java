package Repaso.MarteGroupSA;

import java.lang.reflect.Array;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        EventoMarteGroup eventoMarteGroup =  new EventoMarteGroup();

        Invitado invMeli =  new InvitadoMeli();
        Invitado invStandar = new InvitadoStandar();
        List<Invitado> invitados =  new ArrayList<Invitado>() {};
        invitados.add(invMeli);
        invitados.add(invStandar);
        invitados.add(invMeli);
        eventoMarteGroup.invitados = invitados;

        FuegoArtificial fuego = new FuegoArtificialIndividual("Boom individual");
        FuegoArtificial fuego2 = new FuegoArtificialIndividual("Boom 2");
        FuegoArtificial fuego3= new FuegoArtificialIndividual("Boom 3");


        eventoMarteGroup.fuegosArtificiales.add(fuego);
        eventoMarteGroup.fuegosArtificiales.add(fuego2);
        eventoMarteGroup.fuegosArtificiales.add(fuego3);

        eventoMarteGroup.DistribuirTorta();
        eventoMarteGroup.ReventarFuegosArtificiales();

    }
}

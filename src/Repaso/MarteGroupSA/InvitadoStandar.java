package Repaso.MarteGroupSA;

public class InvitadoStandar implements Invitado{
    @Override
    public void ComerTorta(Torta torta) {
        torta.porcionesDisponibles = 0;
        System.out.println("ñam ñam ñam");
    }
}

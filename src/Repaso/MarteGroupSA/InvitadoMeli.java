package Repaso.MarteGroupSA;

public class InvitadoMeli implements Invitado{

    @Override
    public void ComerTorta(Torta torta) {
        torta.porcionesDisponibles = 0;
        System.out.println("Viva la Chiqui!!");
    }
}

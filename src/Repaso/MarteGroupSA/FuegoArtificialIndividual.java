package Repaso.MarteGroupSA;

public class FuegoArtificialIndividual extends FuegoArtificial{

    public FuegoArtificialIndividual(String ruido){
        this.ruido = ruido;
    }

    public FuegoArtificialIndividual(){
        reventado = false;
        color = "Blanco";
        ruido = "Boom";
    }
    public FuegoArtificialIndividual(String color, String ruido){
        reventado = false;
        this.color = color;
        this.ruido = ruido;
    }

    @Override
    public void Reventar(){
        if(!reventado){
            System.out.println(ruido);
            reventado = true;
        }

    }

}

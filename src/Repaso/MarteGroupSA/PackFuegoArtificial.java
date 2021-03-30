package Repaso.MarteGroupSA;

import java.util.List;

public class PackFuegoArtificial extends FuegoArtificial {

    private boolean reventado = false;
    List<FuegoArtificial> packFuegoArtificial;

    public PackFuegoArtificial(List<FuegoArtificial> fuegos){
        this.packFuegoArtificial = fuegos;
    }

    @Override
    public void Reventar(){
        if(!reventado){
            for(FuegoArtificial fuego: packFuegoArtificial){
                fuego.Reventar();
            }
            reventado = true;
        }
    }
}

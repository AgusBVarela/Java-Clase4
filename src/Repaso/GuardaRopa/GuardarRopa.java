package Repaso.GuardaRopa;

import java.util.HashMap;
import java.util.List;

public class GuardarRopa {
    HashMap ropaAlmacenada;
    static int id;

    public GuardarRopa(){
        ropaAlmacenada = new HashMap<Integer, List<Prenda>>();
        this.id = 1;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        ropaAlmacenada.put(this.id, listaDePrenda);
        int idPrendas = this.id;
        this.id++;
        return idPrendas;
    }

    public void mostrarPrendas(){
        ropaAlmacenada.forEach((k,v) -> System.out.println("Id: " + k + ": Prendas: " + v));
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return (List<Prenda>) ropaAlmacenada.remove(numero);
    }

}

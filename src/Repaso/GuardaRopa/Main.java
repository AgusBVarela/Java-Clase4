package Repaso.GuardaRopa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Prenda p1 =  new Prenda("Zara", "ABC");
        Prenda p2 =  new Prenda("Zara", "DEF");
        List<Prenda> prendas = new ArrayList<Prenda>();
        prendas.add(p1);
        prendas.add(p2);


        GuardarRopa guardaRopa = new GuardarRopa();
        int codigo = guardaRopa.guardarPrendas(prendas);
        List<Prenda> prendasRecuperadas = guardaRopa.devolverPrendas(codigo);

    }
}

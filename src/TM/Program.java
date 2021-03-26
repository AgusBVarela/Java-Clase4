package TM;

import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        //pruebaInicial();
        pruebaFinal();
    }

    private static   void pruebaInicial(){
        Sorter s = (Sorter) MiFactory.getInstance("sorter");

        Integer[] arrayEnteros = new Integer[]{5,2,8,15,3};
        String[] arryCadenas = new String[]{"hola", "holis", "Gato", "Gato perro conejo"};

        Comparator<Integer> compEnteros = (numero1, numero2) -> numero1 < numero2 ? 1 : -1;
        Comparator<String> compCadenas = (cadena1, cadena2) -> cadena1.compareTo(cadena2);
        s.sort(arrayEnteros,compEnteros);
        s.sort(arryCadenas,compCadenas);

    }

    private static void pruebaFinal(){
        Sorter s = (Sorter) MiFactory.getInstance("sorterBurbujeo");
        Integer[] arrayMaxEnteros = new Integer[100000];
        int j = 99999;
        for (int i = 0; i<100000; i++){
            arrayMaxEnteros[j] = i;
            j--;
        }

        Comparator<Integer> compEnteros = (numero1, numero2) -> numero1 < numero2 ? 1 : -1;
        Timer timer = new Timer();
        s.sort(arrayMaxEnteros,compEnteros);
        timer.stop();
        System.out.println("Con burbujeo tardo: " + timer.elapsedTime());
        //for (int i = 0; i<10000; i++){
        //    System.out.println(arrayMaxEnteros[i]);
        //}

        Sorter sorterQS = (Sorter) MiFactory.getInstance("sorterQS");
         j = 99999;
        for (int i = 0; i<100000; i++) {
            arrayMaxEnteros[j] = i;
            j--;
        }
        timer = new Timer();
        s.sort(arrayMaxEnteros,compEnteros);
        timer.stop();
        System.out.println("Con QS tardo: " + timer.elapsedTime());
    }
}

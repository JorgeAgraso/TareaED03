import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ReOrdenar {

    public static int ordenarDesc(final int num) {

        //Your code
        int resultado = 0;
        String numCadena = Integer.toString(num);
        String[] arrayCadena = numCadena.split("");
        ArrayList<Integer> listNum = new ArrayList<Integer>() ;
        for (String i : arrayCadena){
            Integer j = Integer.parseInt(i);
            listNum.add(j);
        }
        Collections.sort(listNum, Comparator.reverseOrder());
        String cadenaOrdenada = "";
        for (Integer i : listNum){
            cadenaOrdenada += Integer.toString(i);
        }
        resultado = Integer.parseInt(cadenaOrdenada);
        return resultado;

    }

}
package NivelBasico.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntroducaoArray {
    static void main() {
        String[] nomes = new String[4];
        nomes[0]= "jamal";
        nomes[1]= "hamilton";
        nomes[2]= "braganza";
        nomes[3]= "esperanza";

        System.out.println(Arrays.toString(nomes));
        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
        }

        // sobreescrevendo
        nomes= new String[4];
        nomes[0]= "hamas";
        nomes[1]= "habib";
        nomes[2]= "bahubali";
        nomes[3]= "coffe";
        System.out.println(Arrays.toString(nomes));

        // String inicializa como null
        String[] exemplo= new String[1];
        System.out.println("valor inicialização String: "+exemplo[0]);

        // int inicializa como 0
        int[] idades= new int[1];
        System.out.println("valor inicialização int: " +idades[0]);

        // double inicializa como 0.0
        double[] doubles= new double[1];
        System.out.println("valor inicialização double: "+ doubles[0]);

        // boolean inicializa como false
        boolean[] booleans = new boolean[1];
        System.out.println("valor inicialização boolean: "+ booleans[0]);

    }
}

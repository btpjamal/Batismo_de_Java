package NivelBasico.Arrays;

import java.util.Arrays;

public class Array2D {
    static void main() {
        String[][] matriz = new String[3][3];
        matriz[0][0]= "Konoha";
        matriz[0][1]= "Naruto";
        matriz[0][2]= "Sasuke";

        matriz[1][0]= "Névoa";
        matriz[1][1]= "Zabuza";
        matriz[1][2]= "Haku";

        matriz[2][0]= "Chuva";
        matriz[2][1]= "Pain";
        matriz[2][2]= "Konan";

        System.out.println(Arrays.deepToString(matriz));
    }
}

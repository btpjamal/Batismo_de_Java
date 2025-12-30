package NivelBasico.Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // variavel = (condicao) ? true : false;

        System.out.print("Numero de missões concluidas: ");
        short numeroDeMissoes = scan.nextShort();
        
        String nivel= (numeroDeMissoes >= 10) ? "high elo" : "beginner";
        System.out.println(nivel);
        
    }
}

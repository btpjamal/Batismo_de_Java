package NIvelIntermediario.Desafio5;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scan = new Scanner(System.in);

        System.out.println("text - iniciar; sair;");
        String userStart= scan.nextLine();
        if (userStart.equals("iniciar")){
            metodos.iniciar();
            metodos.operacoes();
        } else if (userStart.equals("sair")){
            System.out.println("Fim do programa");
        } else {
            System.out.println("Fim do programa");
        }
    }
}

package NIvelIntermediario.EstruturasDeDados.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scan =new Scanner(System.in);
        int userInput = 0;

        while (userInput != 2){
            System.out.println("Lista atual: "+ metodos.ninjaLinkedList);
            System.out.println("1- Adicionar; 2- Remover; 3- Acessar elementos; 4- Alterar");
            int option= scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1:
                    metodos.adicionar();
                    break;
                case 2:
                    metodos.remover();
                    break;
                case 3:
                    metodos.acessar();
                    break;
                case 4:
                    metodos.alterar();
                    break;
            }
            System.out.println("1- Continuar programa; 2- Sair");
            userInput= scan.nextInt();
        }
    }
}

package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma arma");
        System.out.println("1- AK47");
        System.out.println("2- M4A4");
        System.out.println("3- SCAR-H");

        int userInput= scan.nextInt();

        System.out.println("Número inserido: "+ userInput);

        switch (userInput){
            case 1:
                System.out.println("O usuário escolheu AK47");
                break;
            case 2:
                System.out.println("O usuário escolheu M4A4");
                break;
            case 3:
                System.out.println("O usuário escolheu SCAR-H");
                break;
            default:
                System.out.println("Número inválido");
        }

        scan.close();
    }
}

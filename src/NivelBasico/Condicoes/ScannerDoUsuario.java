package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("nome: ");
        String nome= scan.nextLine();
        System.out.print("idade: ");
        int idade = scan.nextInt();

        System.out.println("nome: "+ nome);
        System.out.println("idade: "+ idade);

        if (idade >= 18){
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
        scan.close();
    }
}

package EverithingUntilHere_Intermediary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Criação de personagem");
        System.out.print("Nome: ");
        String nomePersonagem= scan.nextLine();
        System.out.println("Selecione uma classe!");
        System.out.println(Class.WARRIOR.descricaoCompleta());
        System.out.println(Class.MAGE.descricaoCompleta());
        System.out.println(Class.ASSASSIN.descricaoCompleta());
        String classe = scan.nextLine();
        switch (classe){
            case "warrior":
                Warrior warrior = new Warrior(nomePersonagem);
                break;
            case "mage":
                Mage mage = new Mage(nomePersonagem);
                break;
            case "assassin":
                Assassin assassin = new Assassin(nomePersonagem);
                break;
        }

    }
}

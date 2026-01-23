package EverithingUntilHere_Intermediary;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Criação de personagem");
        System.out.print("Nome: ");
        String nomePersonagem= scan.nextLine();
        System.out.println("Selecione uma classe!");
        System.out.println(Classe.WARRIOR.descricaoCompleta());
        System.out.println(Classe.MAGE.descricaoCompleta());
        System.out.println(Classe.ASSASSIN.descricaoCompleta());
        String classe = scan.nextLine();
        Character jogador = null;
        switch (classe){
            case "warrior":
                jogador = new Warrior(nomePersonagem, 350);
                System.out.println("Personagem da classe Warrior criado");
                break;
            case "mage":
                jogador = new Mage(nomePersonagem);
                System.out.println("Personagem da classe Mage criado");
                break;
            case "assassin":
                jogador = new Assassin(nomePersonagem);
                System.out.println("Personagem da classe Assassin criado");
                break;
        }
        // sumonnando os inimigos

        Enemy inimigo = new Enemy();

        // colocando pra fightar

        if (inimigo.defenderComEscudo(jogador)){
            System.out.println("O inimigo defendeu o ataque");
        } else {
            System.out.println("O inimigo foi atingido");
        }
    }
}

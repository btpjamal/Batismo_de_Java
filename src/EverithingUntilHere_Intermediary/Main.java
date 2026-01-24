package EverithingUntilHere_Intermediary;

import java.util.*;
import java.util.stream.Stream;

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
                jogador = new Mage(nomePersonagem, 300);
                System.out.println("Personagem da classe Mage criado");
                break;
            case "assassin":
                jogador = new Assassin(nomePersonagem, 250);
                System.out.println("Personagem da classe Assassin criado");
                break;
        }
        // sumonnando os inimigos
        Enemy inimigo = new Enemy(300);
        System.out.println("Inimigo sumonado!");

        // colocando pra fightar

        // criar turnos de rodada
        Random random = new Random();
        while (jogador.getVida() >=0 || inimigo.getVida() >= 0) {
            int roundStart = random.nextInt(1, 3);
            if (roundStart == 1) {
                System.out.println("jogador inicia o turno");
                assert jogador != null;
                jogador.exibirHabilidades();
                int opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                        jogador.habilidade1(inimigo);
                        System.out.println("Vida jogador: "+ jogador.getVida());
                        System.out.println("Vida inimigo: "+ inimigo.getVida());
                        break;
                    case 2:
                        jogador.habilidade2(inimigo);
                        System.out.println("Vida jogador: "+ jogador.getVida());
                        System.out.println("Vida inimigo: "+ inimigo.getVida());
                        break;
                    case 3:
                        jogador.habilidade3(inimigo);
                        System.out.println("Vida jogador: "+ jogador.getVida());
                        System.out.println("Vida inimigo: "+ inimigo.getVida());
                        break;
                }
            } else {
                System.out.println("inimigo inicia o turno");
                int opcaoInimigo = random.nextInt(1, 4);
                switch (opcaoInimigo) {
                    case 1:
                        assert jogador != null;
                        inimigo.habilidade1(jogador);
                        System.out.println("Vida jogador: "+ jogador.getVida());
                        System.out.println("Vida inimigo: "+ inimigo.getVida());
                        break;
                    case 2:
                        assert jogador != null;
                        inimigo.habilidade2(jogador);
                        System.out.println("Vida jogador: "+ jogador.getVida());
                        System.out.println("Vida inimigo: "+ inimigo.getVida());
                        break;
                    case 3:
                        inimigo.habilidade3(jogador);
                        System.out.println("Vida jogador: "+ jogador.getVida());
                        System.out.println("Vida inimigo: "+ inimigo.getVida());
                        break;
                }
            }
        }
    }
}

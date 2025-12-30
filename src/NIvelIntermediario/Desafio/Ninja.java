package NIvelIntermediario.Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ninja{
    static List<Ninja> ninjasList= new ArrayList<>();
    static List<Uzumaki> uzumakiList= new ArrayList<>();
    static List<Uchiha> uchihaList= new ArrayList<>();
    static List<Hyuuga> hyuugaList= new ArrayList<>();
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    Scanner scanner = new Scanner(System.in);

    public void mostrarInformacoes(){
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idade);
        System.out.println("missão: "+missao);
        System.out.println("nível de dificuldade: "+nivelDificuldade);
        System.out.println("status da missão: "+statusMissao);
    }

    public void cadastrar(){
        //nome
        System.out.print("Digite o nome: ");
        this.nome= scanner.nextLine();

        //idade
        System.out.print("Idade: ");
        this.idade= scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        //missao
        System.out.print("Missão: ");
        this.missao= scanner.nextLine();

        //nivel missao
        System.out.print("Nivel de dificuldade da missão: ");
        this.nivelDificuldade= scanner.nextLine();

        //status missao
        System.out.print("Status da missão: ");
        this.statusMissao= scanner.nextLine();

        ninjasList.add(this);
        System.out.println("Ninja cadastrado");
    }
    public void atualizar(){
        System.out.print("Nova idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nova missão: ");
        this.missao = scanner.nextLine();
        System.out.print("Novo nível de dificuldade: ");
        this.nivelDificuldade = scanner.nextLine();
        System.out.print("Novo status da missão: ");
        this.statusMissao = scanner.nextLine();
        System.out.println("Informações atualizadas com sucesso!");
    }
    public void excluir(){
        ninjasList.remove(this);
        System.out.println("Ninja excluido da lista geral");
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", missao='" + missao + '\'' +
                ", nivelDificuldade='" + nivelDificuldade + '\'' +
                ", statusMissao='" + statusMissao + '\'' +
                '}';
    }
}

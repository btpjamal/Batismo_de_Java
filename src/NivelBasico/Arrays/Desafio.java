package NivelBasico.Arrays;

import java.util.*;
// fiz esse do meu jeito, um pouco mais robuscado,
public class Desafio {
    static void main() throws InterruptedException {
        List<Ninja> ninjasList= new ArrayList<>();
        Scanner scan= new Scanner(System.in);

        String userName;
        int userInput = 0;

        System.out.println("Sistema de cadastro de ninjas");
        System.out.print("Informe seu nome: ");
        userName= scan.nextLine();
        System.out.println("Processando");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);
            System.out.println(".");
        }

        while(userInput != 4){
            System.out.println(userName+ ", selecione a opção desejada");
            System.out.println("1- Cadastro de novo ninja");
            System.out.println("2- Listar ninjas cadastrados");
            System.out.println("3- Excluir ninja cadastrado");
            System.out.println("4- Encerrar o terminal");
            userInput= scan.nextInt();
            scan.nextLine(); // limpar o buffer

            switch (userInput){
                case 1:
                    System.out.print("informe o nome do ninja: ");
                    String nomeNinja= scan.nextLine();

                    System.out.print("informe a idade do ninja: ");
                    int idadeNinja= scan.nextInt();

                    scan.nextLine(); // limpar o buffer

                    Ninja novoNinja= new Ninja(nomeNinja, idadeNinja);
                    ninjasList.add(novoNinja);
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(500);
                        System.out.println(".");
                    }
                    System.out.println("Ninja cadastrado!");
                    break;
                case 2:
                    System.out.println("acessando banco de dados");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(500);
                        System.out.println(".");
                    }
                    System.out.println(ninjasList);
                    break;
                case 3:
                    System.out.println("EXCLUSÃO DE NINJA");
                    System.out.println(ninjasList);
                    System.out.println("informe o nome do ninja: ");
                    String excluir= scan.nextLine();

                    Ninja ninjaParaExcluir = new Ninja(excluir,0);
                    if (ninjasList.contains(ninjaParaExcluir)){
                        ninjasList.remove(ninjaParaExcluir);
                        System.out.println("Ninja removido com sucesso!");
                    } else {
                        System.out.println("Ninja não encontrado");
                    }

                    System.out.println(ninjasList);
                    break;
            }
        }
    }
}

class Ninja{
    String nome;
    int idade;

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return Objects.equals(nome, ninja.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}


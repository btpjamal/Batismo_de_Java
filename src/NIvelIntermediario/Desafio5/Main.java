package NIvelIntermediario.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // iniciar ; sair;
        System.out.println("text -iniciar;- sair");
        String userStart= scan.nextLine();
        if (userStart.equals("iniciar")){
            System.out.println("Selecione o tipo de conta que deseja criar");
            System.out.println("1- Conta Corrente; 2- Conta Poupança");
            int opcaoCriarConta = scan.nextInt();
            scan.nextLine();
            switch (opcaoCriarConta){
                case 1:
                    System.out.println("Conta Corrente selecionada...");
                    System.out.print("Informe o nome da conta -> ");
                    String nomeContaCorrente= scan.nextLine();
                    nomeContaCorrente= String.valueOf(new ContaCorrente());
                    System.out.println("Conta criada!");
                    break;
                case 2:
                    System.out.println("Conta Poupança selecionada...");
                    System.out.println("Conta Poupança selecionada...");
                    System.out.print("Informe o nome da conta -> ");
                    String nomeContaPoupanca= scan.nextLine();
                    nomeContaPoupanca= String.valueOf(new ContaCorrente());
                    System.out.println("Conta criada!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    // PRECISA REBOBINAR PRA OPÇÃO DE ESCOLHER O TIPO DE CONTA

                    break;
            }
            System.out.println("Selecione a operação desejada!");
            System.out.println("1- Criar nova conta; 2- Realizar Saque; 3- Depositar; 4- Transferir; 5- Checar Extrato");
            int opcaoOperacao= scan.nextInt();
        }

    }
}

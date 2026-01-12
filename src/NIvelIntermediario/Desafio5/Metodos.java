package NIvelIntermediario.Desafio5;

import java.util.*;

public class Metodos {
    private String numero;
    private String titular;
    private double saldo;
    List<Double> extratoList= new ArrayList<>();
    Scanner scanner= new Scanner(System.in);

    // usei IA
    private Map<String, ContaBancaria> contasMap= new HashMap<>();

    // usei IA
    public void adicionarConta(ContaBancaria conta){
        contasMap.put(conta.getNumero(), conta);
    }
    // usei IA
    public ContaBancaria buscarConta(String numero){
        return contasMap.get(numero);
    }



    public void iniciar(){
        // conta corrente ou conta poupança
        System.out.println("1- CONTA CORRENTE; 2- CONTA POUPANCA");
        int opcaoConta= scanner.nextInt();
        scanner.nextLine();
        switch (opcaoConta){
            case 1:
                ContaCorrente contaCorrente= new ContaCorrente();
                System.out.println("Número da conta: ");
                String numeroContaCorrente= scanner.nextLine();
                contaCorrente.setNumero(numeroContaCorrente);
                System.out.println("Titular: ");
                String titularCorrente = scanner.nextLine();
                contaCorrente.setTitular(titularCorrente);
                adicionarConta(contaCorrente);
                System.out.println("conta corrente criada");
                break;
            case 2:
                ContaPoupanca contaPoupanca= new ContaPoupanca();
                System.out.println("Número da conta: ");
                String numeroContaPoupanca= scanner.nextLine();
                contaPoupanca.setNumero(numeroContaPoupanca);
                System.out.println("Titular: ");
                String titularPoupanca = scanner.nextLine();
                contaPoupanca.setTitular(titularPoupanca);
                adicionarConta(contaPoupanca);
                System.out.println("conta poupanca criada");
                break;
        }
    }
    public void operacoes(){
        System.out.println("1- Sacar; 2- Depositar; 3- Transferir; 4- Extrato; 5- Criar nova conta; 6- Sair");
        int userChose= scanner.nextInt();
        switch (userChose){
            case 1:
                System.out.print("Valor a ser sacado: ");
                double userValueSaque= scanner.nextDouble();
                // de qual conta vai sacar?

                sacar(userValueSaque);
                operacoes();
            case 2:
                System.out.print("Valor a ser depositado: ");
                double userValueDeposito= scanner.nextDouble();
                // pra qual conta vai depositar?

                depositar(userValueDeposito);
                operacoes();
            case 3:
                System.out.print("Valor a ser transferido: ");
                double userValueTransferencia= scanner.nextDouble();
                scanner.nextLine();
                System.out.println(contasMap);
                // transferir de quem pra quem?
                System.out.println("Conta origem transferência: ");
                String numeroContaOrigem= scanner.nextLine();

                System.out.print("Conta destino transferência: ");
                String numeroContaDestino= scanner.nextLine();

                ContaBancaria origem= buscarConta(numeroContaOrigem);
                ContaBancaria destino= buscarConta(numeroContaDestino);

                if(origem != null && destino != null){
                    System.out.println("Conta Origem encontrada: "+ origem.getTitular());
                    System.out.println("Conta Destino encontrada: "+ destino.getTitular());
                    transferir(userValueTransferencia,//implementar origem, destino);
                    operacoes();
                } else {
                    System.out.println("Conta não encontrada");
                    operacoes();
                }
            case 4:
                extrato();
                operacoes();
            case 5:
                scanner.nextLine();
                iniciar();
                operacoes();
            case 6:
                System.out.println("Fim do programa");
                break;
        }
    }
    public void sacar(double valor, ContaBancaria origem){
        if (saldo>= valor){
           double operacao= saldo -= valor;
           extratoList.add(operacao);
        }
    }
    public void depositar(double valor){
       double operacao= saldo+= valor;
       extratoList.add(operacao);
    }
    public void transferir(double valor,ContaBancaria origem ,ContaBancaria destino){
        sacar(valor, origem);
        destino.depositar(valor);
        extratoList.add(operacao);
    }
    public void extrato(){
        System.out.println(extratoList);
    }

}

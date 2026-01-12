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
        ContaBancaria contaBancaria= new ContaBancaria();
        System.out.println("Número da conta: ");
        String numeroConta= scanner.nextLine();
        contaBancaria.setNumero(numeroConta);
        System.out.println("Titular: ");
        String titular= scanner.nextLine();
        contaBancaria.setTitular(titular);
        adicionarConta(contaBancaria);
        System.out.println("conta criada pelo iniciar()");
    }
    public void operacoes(){
        System.out.println("1- Sacar; 2- Depositar; 3- Transferir; 4- Extrato; 5- Criar nova conta; 6- Sair");
        int userChose= scanner.nextInt();
        switch (userChose){
            case 1:
                System.out.print("Valor a ser sacado: ");
                double userValueSaque= scanner.nextDouble();
                sacar(userValueSaque);
                operacoes();
            case 2:
                System.out.print("Valor a ser depositado: ");
                double userValueDeposito= scanner.nextDouble();
                depositar(userValueDeposito);
                operacoes();
            case 3:
                System.out.print("Valor a ser transferido: ");
                double userValueTransferencia= scanner.nextDouble();
                scanner.nextLine();
                System.out.println(contasMap);
                System.out.print("Conta destino transferência: ");
                String numeroContaDestino= scanner.nextLine();

                ContaBancaria destino= buscarConta(numeroContaDestino);

                if(destino != null){
                    System.out.println("Conta encontrada: "+ destino.getTitular());
                    transferir(userValueTransferencia, destino);
                    operacoes();
                } else {
                    System.out.println("Conta não encontrada");
                    operacoes();
                }
            case 4:
                extrato();
                operacoes();
            case 5:
                iniciar();
                operacoes();
            case 6:
                System.out.println("Fim do programa");
                break;
        }
    }
    public void sacar(double valor){
        if (saldo>= valor){
           double operacao= saldo -= valor;
           extratoList.add(operacao);
        }
    }
    public void depositar(double valor){
       double operacao= saldo+= valor;
       extratoList.add(operacao);
    }
    public void transferir(double valor, ContaBancaria destino){
        double operacao=  saldo -= valor;
        destino.depositar(valor);
        extratoList.add(operacao);
    }
    public void extrato(){
        System.out.println(extratoList);
    }

}

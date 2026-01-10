package NIvelIntermediario.Desafio5;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria implements ContaInterface{

    double saldo;
    List<Double> extratoList= new ArrayList<>();

    @Override
    public void sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;
            extratoList.add(saldo);
            System.out.println("Saque: "+ valor);
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        extratoList.add(saldo);
        System.out.println("Deposito: "+ valor);
    }

    @Override
    public void depositar(double valor, ContaBancaria destino) {
        saldo += valor;
        extratoList.add(saldo);
        System.out.println("Deposito de: "+ valor+ ", para: "+destino);
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) {
        sacar(valor);
        destino.depositar(valor, destino);
    }

    @Override
    public void extrato() {
        System.out.println(extratoList);
    }
}

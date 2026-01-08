package NIvelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado");
    }


}

package NIvelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(TipoConta tipoConta, double saldo) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: "+ this.saldo);
    }

    @Override
    public abstract void depositar(double valor);
}

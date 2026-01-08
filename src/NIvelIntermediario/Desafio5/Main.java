package NIvelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.depositar(100);
        contaCorrente.consultarSaldo();

        contaPoupanca.depositar(200);
        contaPoupanca.consultarSaldo();
    }
}

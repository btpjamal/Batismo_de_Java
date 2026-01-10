package NIvelIntermediario.Desafio5;

public interface ContaInterface {
    void sacar(double valor);
    void depositar(double valor);
    void depositar(double valor, ContaBancaria destino);
    void transferir(double valor, ContaBancaria destino);
    void extrato();

}

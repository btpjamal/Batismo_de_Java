package NIvelIntermediario.Desafio5;

public enum TipoConta {
    CORRENTE("Conta do tipo: CORRENTE"),
    POUPANCA("Conta do tipo: POUPANÇA");

    String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }
}

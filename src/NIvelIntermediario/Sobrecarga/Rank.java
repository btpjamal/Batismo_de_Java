package NIvelIntermediario.Sobrecarga;

public enum Rank {
    GENIN("Primeira patente"),
    CHUNIN("Patente intermediária"),
    JONIN("Patente avançada"),
    KAGE("Patente máxima");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    Rank(String descricao) {
        this.descricao = descricao;
    }
}

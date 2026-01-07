package NIvelIntermediario.Enums;

public enum RankDeMissoes {

    D("Fácil", 1),
    C("Medio", 2),
    B("Difícil", 3),
    A("Veterano", 4),
    S("Extremo", 5);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}

package NIvelIntermediario.GenericsPt2;

public class Pergaminho {
    private String invocacao;

    public Pergaminho(String invocacao) {
        this.invocacao = invocacao;
    }

    public String getInvocacao() {
        return invocacao;
    }

    public void setInvocacao(String invocacao) {
        this.invocacao = invocacao;
    }

    @Override
    public String toString() {
        return "Pergaminho de invocação tipo "+ invocacao;
    }
}

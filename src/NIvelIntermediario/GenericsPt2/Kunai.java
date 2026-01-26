package NIvelIntermediario.GenericsPt2;

public class Kunai {
    private String tamanho;

    public Kunai(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Kunai de tamanho "+ tamanho;
    }
}

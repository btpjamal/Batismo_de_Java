package EverithingUntilHere_Intermediary;

public abstract class Character {
    private String nome;
    private double vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public Character(String nome) {
        this.nome = nome;
    }
}

package EverithingUntilHere_Intermediary;

public abstract class Character {
    private String nome;
    private double vida;
    private boolean escudoLevantado = false;
    private Enemy inimigo;

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

    public Character(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void receberAtaque(double dano){
        if (escudoLevantado){
            dano /= 2;
            escudoLevantado = false;
        }
        setVida(getVida() - dano);
    }
    public abstract void exibirHabilidades();
    public abstract void habilidade1(Enemy inimigo);
    public abstract void habilidade2(Enemy inimigo);
    public abstract void habilidade3(Enemy inimigo);
}

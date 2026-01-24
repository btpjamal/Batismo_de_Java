package EverithingUntilHere_Intermediary;

public class Enemy{
    private double vida;
    boolean escudoLevantado= false;

    public Enemy(double vida) {
        this.vida=vida;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void habilidade1(Character jogador) {
        System.out.println("Executando sequencia de ataques");
        jogador.setVida(jogador.getVida() -50);
    }

    public void habilidade2(Character jogador) {
        System.out.println("Arremessando adaga");
        jogador.setVida(jogador.getVida() -50);
    }

    public void habilidade3(Character jogador) {
        escudoLevantado = true;
        System.out.println("Inimigo levantou o escudo");
    }
}

package EverithingUntilHere_Intermediary;

public class Enemy extends Character implements EnemyInterface{
    private boolean escudoLevantado = false;

    public Enemy() {
        super("inimigo");
        setVida(300);
    }

    @Override
    public void sequenciaDeAtaques(Character jogador) {
        System.out.println("Executando sequencia de ataques");
        jogador.setVida(jogador.getVida() -50);
        System.out.println("Vida do jogador: "+ jogador.getVida());
    }

    @Override
    public void arremessarAdaga(Character jogador) {
        System.out.println("Arremessando adaga");
        jogador.setVida(jogador.getVida() -50);
        System.out.println("Vida do jogador: "+ jogador.getVida());
    }

    @Override
    public boolean defenderComEscudo(Character jogador) {
        escudoLevantado= true;
        System.out.println("Inimigo levantou o escudo");
        return true;
    }
}

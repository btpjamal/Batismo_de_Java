package EverithingUntilHere_Intermediary;

public class Assassin extends Character implements AssassinInterface{

    public Assassin(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void ataqueEmPontoFraco(Enemy inimigo) {
        System.out.println("Ataque preciso em ponto fraco, causa sangramento");
        inimigo.setVida(inimigo.getVida() - 100);
    }

    @Override
    public void ataqueComVeneno(Enemy inimigo) {
        System.out.println("Ataque que causa envenenamento ao alvo");
        inimigo.setVida(inimigo.getVida() - 100);
    }

    @Override
    public void arremessoDeFaca(Enemy inimigo) {
        System.out.println("Arremessa uma faca com efeito de debuff aleatório");
        inimigo.setVida(inimigo.getVida() - 100);
    }
}

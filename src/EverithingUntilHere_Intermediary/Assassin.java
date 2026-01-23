package EverithingUntilHere_Intermediary;

public class Assassin extends Character implements AssassinInterface{

    public Assassin(String nome) {
        super(nome);
        setVida(250);
    }

    @Override
    public void ataqueEmPontoFraco() {
        System.out.println("Ataque preciso em ponto fraco, causa sangramento");
    }

    @Override
    public void ataqueComVeneno() {
        System.out.println("Ataque que causa envenenamento ao alvo");
    }

    @Override
    public void arremessoDeFaca() {
        System.out.println("Arremessa uma faca com efeito de debuff aleatório");
    }
}

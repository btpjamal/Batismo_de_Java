package EverithingUntilHere_Intermediary;

public class Assassin extends Character{

    public Assassin(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void exibirHabilidades() {
        System.out.println("1- Ataque em ponto fraco");
        System.out.println("2- Ataque com veneno");
        System.out.println("3- Arremessar faca");
    }

    @Override
    public void habilidade1(Enemy inimigo) {
        System.out.println("Ataque preciso em ponto fraco, causa sangramento");
        inimigo.setVida(inimigo.getVida() - 100);
    }

    @Override
    public void habilidade2(Enemy inimigo) {
        System.out.println("Ataque que causa envenenamento ao alvo");
        inimigo.setVida(inimigo.getVida() - 100);
    }

    @Override
    public void habilidade3(Enemy inimigo) {
        System.out.println("Arremessa uma faca com efeito de debuff aleatório");
        inimigo.setVida(inimigo.getVida() - 100);
    }
}

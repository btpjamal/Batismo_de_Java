package EverithingUntilHere_Intermediary;

public class Warrior extends Character{

    boolean escudoLevantado= false;

    public Warrior(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void exibirHabilidades() {
        System.out.println("1- Ataque com espada flamejante");
        System.out.println("2- Defender com escudo");
        System.out.println("3- Aprimorar resistência");
    }

    @Override
    public void habilidade1(Enemy inimigo) {
        System.out.println("Ataque com espada flamejante");
        inimigo.setVida(inimigo.getVida() - 50);
    }

    @Override
    public void habilidade2(Enemy inimigo) {
        System.out.println("Defesa com escudo");
        escudoLevantado = true;
    }

    @Override
    public void habilidade3(Enemy inimigo) {
        System.out.println("Aprimorar resistência");
        setVida(getVida() + 50);
        System.out.println("Resistencia aprimorada, + vigor");
    }
}

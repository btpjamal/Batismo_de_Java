package EverithingUntilHere_Intermediary;

public class Mage extends Character{

    public Mage(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void exibirHabilidades() {
        System.out.println("1- Feitiço de magia pedrilhante");
        System.out.println("2- Feitiço de cura");
        System.out.println("3- Encantamento chama do frenesi");
    }

    @Override
    public void habilidade1(Enemy inimigo) {
        System.out.println("Conjuração de cristal pedrilhante ao alvo");
        inimigo.setVida(inimigo.getVida() - 70);
        System.out.println("vida do inimigo: "+inimigo.getVida());
    }

    @Override
    public void habilidade2(Enemy inimigo) {
        System.out.println("Conjuração de magia de cura");
        setVida(getVida() + 50);
        System.out.println("Vida :"+ getVida());
    }

    @Override
    public void habilidade3(Enemy inimigo) {
        System.out.println("Encantamento ocular de chama do frenesi");
        inimigo.setVida(inimigo.getVida() - 100);
        System.out.println("vida do inimigo: "+inimigo.getVida());
    }
}

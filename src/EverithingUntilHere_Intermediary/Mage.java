package EverithingUntilHere_Intermediary;

public class Mage extends Character implements MageInterface{

    public Mage(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void feiticoPedrilhante(Enemy inimigo) {
        System.out.println("Conjuração de cristal pedrilhante ao alvo");
        inimigo.setVida(inimigo.getVida() - 70);
        System.out.println("vida do inimigo: "+inimigo.getVida());
    }

    @Override
    public void feiticoDeCura() {
        System.out.println("Conjuração de magia de cura");
        setVida(getVida() + 50);
        System.out.println("Vida :"+ getVida());
    }

    @Override
    public void encantamentoChamaDoFrenesi(Enemy inimigo) {
        System.out.println("Encantamento ocular de chama do frenesi");
        inimigo.setVida(inimigo.getVida() - 100);
        System.out.println("vida do inimigo: "+inimigo.getVida());
    }
}

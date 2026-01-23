package EverithingUntilHere_Intermediary;

public class Mage extends Character implements MageInterface{

    public Mage(String nome) {
        super(nome);
        setVida(300);
    }

    @Override
    public void feiticoPedrilhante() {
        System.out.println("Conjuração de cristal pedrilhante ao alvo");
    }

    @Override
    public void feiticoDeCura() {
        System.out.println("Conjuração de magia de cura");
    }

    @Override
    public void encantamentoChamaDoFrenesi() {
        System.out.println("Encantamento ocular de chama do frenesi");
    }
}

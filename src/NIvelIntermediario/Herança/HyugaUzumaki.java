package NIvelIntermediario.Herança;

public class HyugaUzumaki extends Uzumaki implements HyugaUzumaki_Interface{
    @Override
    public void AtivarKarma() {
        System.out.println("Karma ativado");
    }

    @Override
    public void AtivarJougan() {
        System.out.println("Jougan ativado");
    }
}

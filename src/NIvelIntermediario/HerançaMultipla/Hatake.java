package NIvelIntermediario.HerançaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{ // herança multipla
    @Override
    public void Descricao() {
        super.Descricao();
        System.out.println("Ninja do clã Hatake");
    }

    public Hatake(String nome, int idade) {
        super(nome, idade);
    }

    public Hatake() {
    }

    @Override
    public void IntegranteAnbu() {
        System.out.println(nome + ", é integrante da Anbu");
    }

    @Override
    public void AtivarSharingan() {
        System.out.println(nome + ", ativou o sharingan");
    }
}

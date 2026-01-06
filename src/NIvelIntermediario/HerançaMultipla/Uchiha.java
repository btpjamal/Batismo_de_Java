package NIvelIntermediario.HerançaMultipla;

public class Uchiha extends Ninja implements SharinganInterface{

    // sobreescrita de método
    @Override
    public void Descricao() {
        super.Descricao();
        System.out.println("Ninja do clã Uchiha");
    }

    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    public Uchiha() {
    }

    @Override
    public void AtivarSharingan() {
        System.out.println(nome + ", ativou o sharingan");
    }
}

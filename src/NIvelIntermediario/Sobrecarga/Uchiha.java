package NIvelIntermediario.Sobrecarga;

public class Uchiha extends Ninja implements SharinganInterface, KageInterface{
    private Rank rank;

    @Override
    public void Hokage() {
        System.out.println("Potêncial para Hokage");
    }

    @Override
    public void Sharingan() {
        System.out.println("Possui Sharingan");
    }

    @Override
    public void Infos() {
        super.Infos();
        Hokage();
        Sharingan();
        System.out.println(rank.getDescricao());
    }

    // construtor vazio
    public Uchiha() {
    }

    // primeiro construtor
    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    // segundo construtor (sobrecarga)
    public Uchiha(String nome, int idade, Rank rank) {
        super(nome, idade, rank);
    }
}

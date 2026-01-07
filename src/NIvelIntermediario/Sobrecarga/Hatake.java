package NIvelIntermediario.Sobrecarga;

public class Hatake extends Ninja implements SharinganInterface, KageInterface, AnbuInterface{
    private Rank rank;

    @Override
    public void Anbu() {
        System.out.println("Fez parte da Anbu");
    }

    @Override
    public void Hokage() {
        System.out.println("Foi Hokage");
    }

    @Override
    public void Sharingan() {
        System.out.println("Possuia Sharingan");
    }

    @Override
    public void Infos() {
        super.Infos();
        Anbu();
        Hokage();
        Sharingan();
        System.out.println(rank.getDescricao());
    }

    public Hatake() {
    }

    public Hatake(String nome, int idade) {
        super(nome, idade);
    }

    public Hatake(String nome, int idade, Rank rank) {
        super(nome, idade, rank);
    }
}

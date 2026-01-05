package NIvelIntermediario.Abstratos;

public class Senju extends Hokage{

    @Override
    public void sabedoriaHokage() {
        System.out.println("Receba inteligência");
    }

    public Senju(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    public Senju() {
    }

}

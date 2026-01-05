package NIvelIntermediario.Construtor;

public class Hokage {
    String nome;
    int idade;
    Boolean vivo;
    double altura;
    String aldeia;


    // AllArgs constructor
    public Hokage(String nome, int idade, Boolean vivo, double altura, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
        this.altura = altura;
        this.aldeia = aldeia;
    }

    // NoArgs constructor
    public Hokage() {
    }
}

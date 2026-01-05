package NIvelIntermediario.Abstratos;

public abstract class Hokage implements Ninja{ // todo hokage necessáriamente é um ninja
    String nome;
    int idade;
    double altura;

    public abstract void sabedoriaHokage();


    public Hokage(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Hokage() {
    }

    // todo hokage deve obrigatóriamente dominar o chacara
    @Override
    public void DominacaoDeChacara() {
        System.out.println("Eu domino o chacara");
    }
}

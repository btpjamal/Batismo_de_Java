package NIvelIntermediario.Abstratos;

public class Main {
    public static void main(String[] args) {
        Senju hogake1= new Senju("Hashirama", 35, 1.80);
        System.out.println(hogake1.nome);
        System.out.println(hogake1.idade);
        System.out.println(hogake1.altura);
        hogake1.sabedoriaHokage();
        hogake1.DominacaoDeChacara();
    }
}

package NIvelIntermediario.Construtor;

public class Main {
    public static void main(String[] args) {


        Hokage hokage01= new Hokage("Hashirama", 30, false, 1.80, "Folha");
        System.out.println("Nome: "+hokage01.nome);
        System.out.println("Idade: "+hokage01.idade);
        System.out.println("Vivo?: "+hokage01.vivo);
        System.out.println("Altura: "+hokage01.altura);
        System.out.println("Aldeia: "+hokage01.aldeia);
    }
}

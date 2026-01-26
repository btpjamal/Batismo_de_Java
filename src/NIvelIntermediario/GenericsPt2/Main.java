package NIvelIntermediario.GenericsPt2;

public class Main {
    public static void main(String[] args) {
        ItemsBag bolsa= new ItemsBag<>();

        bolsa.addItems(new Kunai("3"));
        bolsa.addItems(new Pergaminho("Sapo"));

        System.out.println(bolsa);
    }
}

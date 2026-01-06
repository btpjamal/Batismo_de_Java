package NIvelIntermediario.HerançaMultipla;

public class Main {
    public static void main(String[] args) {
        Uchiha ninja1= new Uchiha("Sasuke", 25);
        ninja1.Descricao();
        ninja1.AtivarSharingan();

        System.out.println("-=-=-=-=-=-=-=-=-=");

        Hatake ninja2= new Hatake("Kakashi", 48);
        ninja2.Descricao();
        ninja2.AtivarSharingan();
        ninja2.IntegranteAnbu();
    }
}

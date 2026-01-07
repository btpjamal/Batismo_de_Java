package NIvelIntermediario.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Uchiha Madara= new Uchiha("Madara", 40);
        Madara.Infos();

        Uchiha Sasuke= new Uchiha("Sasuke", 25, Rank.KAGE);
        Sasuke.Infos();

        Hatake Kakashi= new Hatake("Kakashi", 45);
        Kakashi.Infos();
    }
}

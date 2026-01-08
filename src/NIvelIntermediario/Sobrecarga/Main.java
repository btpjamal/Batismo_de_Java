package NIvelIntermediario.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Uchiha Madara= new Uchiha("Madara", 40, Rank.KAGE);
        Madara.Infos();
        Madara.Sharingan(3);

        Uchiha Sasuke= new Uchiha("Sasuke", 25, Rank.KAGE);
        Sasuke.Infos();

        Hatake Kakashi= new Hatake("Kakashi", 45, Rank.KAGE);
        Kakashi.Infos();

        Uchiha Obito = new Uchiha("Obito", 35, Rank.JONIN);
        Obito.Infos();
    }
}

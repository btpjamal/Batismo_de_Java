package NivelBasico.Condicoes;

public class IFeElse {
    public static void main(String[] args) {
        String nome= "Jamilton";
        String rank = "";
        int idade= 30;
        boolean lastLevel= false;
        short numeroDeMissoes= 30;

        if (idade >= 30 && numeroDeMissoes >= 30){
            rank= "pro";
        } else if (idade >= 25 && numeroDeMissoes >= 25) {
            rank= "high elo";
        } else if (idade >= 18 && numeroDeMissoes >= 10) {
            rank= "beginner";
        } else {
            rank= "no elo";
        }

        if (rank == "pro" && idade >= 30){
            lastLevel= true;
        }

        System.out.println(nome);
        System.out.println("idade: "+ idade);
        System.out.println("numero de missoes: "+ numeroDeMissoes);
        System.out.println("rank:"+ rank);
        System.out.println("last level: "+ lastLevel);
    }
}

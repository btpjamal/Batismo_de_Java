package NIvelIntermediario.Desafio2;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninja01= new NinjaBasico("Defalt", 18, "Fire Ball Jutsu");
        NinjaAvancado ninja02= new NinjaAvancado("Madara", 40, "Rinnegan", "Susanoo");

        ninja01.mostrarInformacoes();
        ninja01.executarHabilidade();

        ninja02.mostrarInformacoes();
        ninja02.executarHabilidade();
    }
}

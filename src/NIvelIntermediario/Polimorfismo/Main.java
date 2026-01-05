package NIvelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Ninja ninja01= new Ninja();
        ninja01.nome= "Default";
        ninja01.abilidadeEspecial(); // usa o método geral padrão

        Uzumaki ninja02= new Uzumaki();
        ninja02.nome= "Naruto";
        ninja02.abilidadeEspecial(); // usa o método geral adaptado a uzumaki

        Uchiha ninja03= new Uchiha();
        ninja03.nome= "Sasuke";
        ninja03.abilidadeEspecial(); // usa o método geral adaptado a uchiha
    }
}

package NIvelIntermediario.Herança;

public class Main {
   public static void main(String[] args) {


        //objeto 1
        Uzumaki Naruto= new Uzumaki();
        Naruto.nome= "Naruto Uzumaki";
        Naruto.idade= 17;
        Naruto.aldeia= "Aldeia da folha";
        Naruto.ModoSabioAtivado();

        //objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome= "Sasuke Uchiha";
        Sasuke.idade= 18;
        Sasuke.aldeia= "Aldeia da folha";
        Sasuke.SharinganAtivado();

        //objeto 3
        Haruno Sakura= new Haruno();
        Sakura.nome= "Sakura Haruno";
        Sakura.idade= 17;
        Sakura.aldeia= "Aldeia da folha";
        Sakura.ativarCura();

        //objeto 4
        Hyuga Hinata= new Hyuga();
        Hinata.nome= "Hinata Hyuga";
        Hinata.idade= 16;
        Hinata.aldeia= "Aldeia da folha";
        Hinata.byakuganAtivado();

        HyugaUzumaki Boruto= new HyugaUzumaki();
        Boruto.nome= "Boruto";
        Boruto.idade= 15;
        Boruto.aldeia= "Aldeia da Folha";
        Boruto.ModoSabioAtivado();
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
    }
}


package NIvelIntermediario.Herança;

public class Ninja{
    String nome;
    int idade;
    String aldeia;


    public String euSouUmNinja(){
        return "Oi, eu sou um ninja";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}

package NivelBasico.Condicoes;

import java.util.ArrayList;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
        List<Ninja> ninjas= new ArrayList<>();

        Ninja ninja1= new Ninja();
        ninja1.nome= "Jamilton";
        ninja1.idade= 14;
        ninja1.missao= "moggar os betinhas";
        ninja1.nivelDificuldade= 'D';


        Ninja ninja2= new Ninja();
        ninja2.nome= "Ramendes";
        ninja2.idade= 30;
        ninja2.missao= "farmar aura";
        ninja2.nivelDificuldade= 'C';

        Ninja ninja3= new Ninja();
        ninja3.nome= "Hernandes";
        ninja3.idade= 14;
        ninja3.missao= "praticar mewing";
        ninja3.nivelDificuldade= 'B';

        ninjas.add(ninja1);
        ninjas.add(ninja2);
        ninjas.add(ninja3);
        System.out.println(ninjas);

    }
}
class Ninja{
    String nome;
    int idade;
    String missao;
    char nivelDificuldade;
    boolean concluida;

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", missao='" + missao + '\'' +
                ", nivelDificuldade=" + nivelDificuldade +
                ", concluida=" + PasseMissao() +
                '}';
    }

    public boolean PasseMissao(){
        if (idade < 15 && nivelDificuldade == 'A' || idade < 15 && nivelDificuldade == 'B'){
            return concluida = false;
        } else {
        return concluida= true;
        }
    }
}


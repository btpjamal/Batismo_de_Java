package EverithingUntilHere_Intermediary;

public class Warrior extends Character implements WarriorInterface{

    public Warrior(String nome) {
        super(nome);
        setVida(500);
    }

    @Override
    public void ataqueComEspadaFlamejante() {
        System.out.println("Ataque com espada flamejante");
    }

    @Override
    public void defesaComEscudo() {
        System.out.println("Defesa com escudo");
    }

    @Override
    public void resistenciaAprimorada() {
        System.out.println("Resistencia aprimorada, + vigor");
    }
}

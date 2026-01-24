package EverithingUntilHere_Intermediary;

public class Warrior extends Character implements WarriorInterface{

    boolean escudoLevantado= false;

    public Warrior(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void ataqueComEspadaFlamejante(Enemy inimigo) {
        inimigo.setVida(inimigo.getVida() - 50);
        System.out.println("Ataque com espada flamejante");
    }

    @Override
    public void defesaComEscudo(Enemy inimigo) {
        System.out.println("Defesa com escudo");
        escudoLevantado = true;
    }

    @Override
    public void resistenciaAprimorada(Enemy inimigo) {
        System.out.println("Resistencia aprimorada, + vigor");
    }
}

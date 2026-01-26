package NIvelIntermediario.GenericsPt1;

public class Main {
    public static void main(String[] args) {
        Equipamentos kunai= new Equipamentos("Kunai de ferro");
        Equipamentos Shuriken= new Equipamentos("Shuriken");
        Equipamentos Pergaminho= new Equipamentos("Pergaminho");

        Bag<Equipamentos> equipamentosBag = new Bag<>();
        equipamentosBag.adicionarEquipamento(kunai);
        equipamentosBag.adicionarEquipamento(Shuriken);
        equipamentosBag.adicionarEquipamento(Pergaminho);

        System.out.println(equipamentosBag);


    }
}

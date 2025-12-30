package NIvelIntermediario.Desafio;

public class Hyuuga extends Ninja{

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        byakuugan();
        hyuugaList.add(this);
    }

    public void byakuugan(){
        System.out.println("esse ninja possui acesso ao byakuugan");
    }

    @Override
    public void excluir() {
        super.excluir();
        hyuugaList.remove(this);
        System.out.println("Ninja hyuuga excluído");
    }
}

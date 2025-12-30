package NIvelIntermediario.Desafio;

public class Uzumaki extends Ninja{

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        modoSabio();
        uzumakiList.add(this);
    }

    public void modoSabio(){
        System.out.println("esse ninja possui acesso ao Modo sábio");
    }

    @Override
    public void excluir() {
        super.excluir();
        uzumakiList.remove(this);
        System.out.println("Ninja uzumaki excluído");
    }
}

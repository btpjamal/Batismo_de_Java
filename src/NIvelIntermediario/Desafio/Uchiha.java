package NIvelIntermediario.Desafio;

public class Uchiha extends Ninja{

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        sharingan();
        uchihaList.add(this);
    }

    public void sharingan(){
        System.out.println("esse ninja possui acesso ao sharingan");
    }

    @Override
    public void excluir() {
        super.excluir();
        uchihaList.remove(this);
        System.out.println("Ninja uchiha excluído");
    }
}

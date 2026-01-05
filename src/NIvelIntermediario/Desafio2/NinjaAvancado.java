package NIvelIntermediario.Desafio2;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Habilidade: "+ habilidade);
        System.out.println("Especialidade: "+ especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executando "+habilidade + " especialidade: "+ especialidade);
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {
    }
}

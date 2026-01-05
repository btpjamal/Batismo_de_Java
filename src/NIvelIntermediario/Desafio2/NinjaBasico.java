package NIvelIntermediario.Desafio2;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Habilidade: "+ habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executando "+habilidade);
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico() {
    }
}

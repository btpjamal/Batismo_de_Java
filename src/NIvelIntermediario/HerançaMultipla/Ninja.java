package NIvelIntermediario.HerançaMultipla;

public abstract class Ninja {
    String nome;
    int idade;

    // todo objeto criado a partir dessa classe, possui acesso ao método
    public void Descricao(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Ninja() {
    }
}

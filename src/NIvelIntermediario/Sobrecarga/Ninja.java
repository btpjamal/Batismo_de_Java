package NIvelIntermediario.Sobrecarga;

public abstract class Ninja {
    private String nome;
    private int idade;
    private Rank rank;

    public void Infos(){
        System.out.println("Nome: "+ nome + ", Idade: "+ idade);
        if (this.rank != null){
            System.out.println(rank.getDescricao());
        } else {
            System.out.println("Sem Rank");
        }
    }

    // construtor vazio
    public Ninja() {
    }

    // primeiro construtor
    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // segundo construtor (sobrecarga)
    public Ninja(String nome, int idade, Rank rank) {
        this(nome, idade);
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

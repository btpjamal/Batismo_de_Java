package EverithingUntilHere_Intermediary;

public enum Classe {
    WARRIOR("Guerreiro de porte médio, intermédio entre defesa e ataque", "Espadas médias e escudos"),
    ASSASSIN("Guerreiro de porte leve, possui melhor furtividade", "Adagas e facas de arremesso"),
    MAGE("Guerreiro de porte leve, afinidade com margias arcanas e encantamentos", "Cajados e pergaminhos");

    private String descricao;
    private String escalabilidadeArmas;

    Classe(String descricao) {
        this.descricao = descricao;
    }

    Classe(String descricao, String escalabilidadeArmas) {
        this.descricao = descricao;
        this.escalabilidadeArmas = escalabilidadeArmas;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEscalabilidadeArmas() {
        return escalabilidadeArmas;
    }

    public String descricaoCompleta(){
        return Classe.this +": "+ getDescricao() +" / armas: "+ getEscalabilidadeArmas();
    }
}

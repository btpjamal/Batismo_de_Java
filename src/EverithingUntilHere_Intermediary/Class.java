package EverithingUntilHere_Intermediary;

public enum Class {
    WARRIOR("Guerreiro de porte médio, intermédio entre defesa e ataque", "Espadas médias e escudos"),
    ASSASSIN("Guerreiro de porte leve, possui melhor furtividade", "Adagas e facas de arremesso"),
    MAGE("Guerreiro de porte leve, afinidade com margias arcanas e encantamentos", "Cajados e pergaminhos");

    private String descricao;
    private String escalabilidadeArmas;

    Class(String descricao) {
        this.descricao = descricao;
    }

    Class(String descricao, String escalabilidadeArmas) {
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
        return Class.this +": "+ getDescricao() +" / armas: "+ getEscalabilidadeArmas();
    }
}

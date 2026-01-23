package EverithingUntilHere_Intermediary;

public enum Class {
    WARRIOR("Guerreiro de porte médio, intermédio entre defesa e ataque", "Espadas médias e escudos"),
    ASSASSIN("Guerreiro de porte leve, possui melhor furtividade", "Adagas e facas de arremesso"),
    MAGE("Guerreiro de porte leve, afinidade com margias arcanas e encantamentos", "Cajados e pergaminhos"),
    DRUID("Guerreiro de porte médio, mas contém transformações que alteram seu porte", "Arcos, runas elementais de transformação"),
    PALADIN("Guerreiro de porte pesado, muito vigor", "Alabardas e lanças sagradas"),
    NECROMANTER("Guerreiro de porte leve, muita mana e roubo de vida", "Pergaminhos para reviver os mortos, comandos necróticos");

    private String descricao;
    private String escalabilidadeArmas;

    Class(String descricao) {
        this.descricao = descricao;
    }

    Class(String descricao, String escalabilidadeArmas) {
        this.descricao = descricao;
        this.escalabilidadeArmas = escalabilidadeArmas;
    }
}

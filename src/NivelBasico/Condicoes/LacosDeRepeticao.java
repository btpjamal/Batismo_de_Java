package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int qtd= 0;
        int qtdMax= 40;

        while (qtd <= qtdMax){
            qtd++;
            System.out.println(qtd);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int i = 0; i <= 40; i++) {
            System.out.println(i);
        }
    }
}

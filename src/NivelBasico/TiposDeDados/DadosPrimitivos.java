package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        Dados não primitivos: int, double, float, char, boolean
        tipos primitivos não recebem nenhum metodo
         */
        int idade= 25; // Valor maximo: 2147483647
        double altura= 1.82;
        char inicial= 'J';
        boolean vivoOuMorto= true;
        Long saldoBancario= 2049876241984321351L;

        System.out.println("Idade: " + idade);
        System.out.println("Saldo bancário: "+ saldoBancario);
        System.out.println("Altura: "+ altura);
        System.out.println("Vivo?: "+ vivoOuMorto);

        //idade. <- não recebe metodo
    }
}

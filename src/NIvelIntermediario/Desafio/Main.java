package NIvelIntermediario.Desafio;

import java.util.Scanner;

public class Main extends Ninja {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int opcao= 0;
        while (opcao != 5){

            System.out.println("1- cadastrar novo ninja");
            System.out.println("2- exibir informações de todos os ninjas");
            System.out.println("3- atualizar informações do ninja");
            System.out.println("4- excluir um ninja");
            System.out.println("5- encerrar o programa");

            opcao= scan.nextInt();
            scan.nextLine(); // limpar o buffer

            switch (opcao){


                case 1:
                    System.out.println("CADASTRO DE NOVO NINJA");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("A qual clã pertence?");
                    System.out.println("1- uzumaki; 2- uchiha; 3- hyuuga; 4- nenhum");

                    int cla= scan.nextInt();
                    scan.nextLine(); //limpar o buffer

                    Ninja ninja = null;
                    switch (cla){
                        case 1:
                            System.out.println("NINJA DO CLÃ UZUMAKI");
                            ninja= new Uzumaki();
                            break;
                        case 2:
                            System.out.println("NINJA DO CLÃ UCHIHA");
                            ninja= new Uchiha();
                            break;
                        case 3:
                            System.out.println("NINJA DO CLÃ HYUUGA");
                            ninja= new Hyuuga();
                            break;
                        case 4:
                            System.out.println("SEM CLÃ");
                            ninja = new Ninja();
                            break;
                        default:
                            System.out.println("opção inválida");
                            break;
                    }
                    if (ninja != null){
                        ninja.cadastrar();
                    }
                    break;


                case 2:
                    System.out.println("EXIBIR INFORMAÇÕES DE TODOS OS NINJAS");
                    System.out.println("1- Lista uzumakis; 2- Lista uchihas; 3- Lista hyuugas; 4- Lista geral");
                    int opcaoLista= scan.nextInt();
                    switch (opcaoLista){
                        case 1:
                            for (Ninja n : Ninja.uzumakiList){
                                n.mostrarInformacoes();
                                System.out.println("-=-=-=-=-=-=-=-=-=-=");
                            }
                            break;
                        case 2:
                            for (Ninja n : Ninja.uchihaList){
                                n.mostrarInformacoes();
                                System.out.println("-=-=-=-=-=-=-=-=-=-=");
                            }
                            break;
                        case 3:
                            for (Ninja n : Ninja.hyuugaList){
                                n.mostrarInformacoes();
                                System.out.println("-=-=-=-=-=-=-=-=-=-=");
                            }
                            break;
                        case 4:
                            for (Ninja n : Ninja.ninjasList){
                                n.mostrarInformacoes();
                                System.out.println("-=-=-=-=-=-=-=-=-=-=");
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("ATUALIZAR INFORMAÇÕES NINJA");
                    System.out.println(ninjasList);
                    System.out.println("Informe o nome do ninja a ser atualizado");
                    String ninjaAtualizar= scan.nextLine();

                    Ninja encontrado= null;
                    for (Ninja n : Ninja.ninjasList){
                        if (n.nome.equalsIgnoreCase(ninjaAtualizar)){
                            encontrado = n;
                            break;
                        }
                    }
                    if (encontrado != null){
                        System.out.println("ATUALIZANDO INFORMAÇÕES DO NINJA: "+ encontrado.nome);
                        encontrado.atualizar();
                    } else {
                        System.out.println("Ninja não encontrado");
                    }
                    break;

                case 4:
                    System.out.println("EXCLUIR NINJA");
                    System.out.println(ninjasList);
                    System.out.println("Informe o nome do ninja a ser excluido");
                    String ninjaExcluir= scan.nextLine();

                    Ninja encontrado2= null;
                    for (Ninja n : Ninja.ninjasList){
                        if (n.nome.equalsIgnoreCase(ninjaExcluir)){
                            encontrado2= n;
                            break;
                        }
                    }
                    if (encontrado2 != null){
                        System.out.println("EXCLUINDO INFORMAÇÕES DO NINJA: "+encontrado2.nome);
                        encontrado2.excluir();
                    } else {
                        System.out.println("Ninja não encontrado");
                    }
                    break;
            }
        }
    }
}

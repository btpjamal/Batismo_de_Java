package NIvelIntermediario.EstruturasDeDados.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Metodos extends Ninja{
    LinkedList<Ninja> ninjaLinkedList= new LinkedList<>();
    Scanner scan= new Scanner(System.in);

    public void adicionar(){
        System.out.println("Adicionar");
        System.out.println("1- Adicionar nova pessoa; 2- sair");
        int userChose= scan.nextInt();
        scan.nextLine();
        while (userChose== 1){
            System.out.print("Nome: ");
            String ninjaNome= scan.nextLine();
            System.out.print("Idade: ");
            int ninjaIdade= scan.nextInt();
            scan.nextLine();
            System.out.print("Vila: ");
            String ninjaVila= scan.nextLine();
            Ninja ninja= new Ninja(ninjaNome, ninjaIdade, ninjaVila);
            ninjaLinkedList.add(ninja);
            System.out.println("1- Adicionar nova pessoa; 2- sair");
            userChose = scan.nextInt();
            scan.nextLine();
        }
    }
    public void remover(){
        System.out.println("Remover");
        System.out.println("Lista atual: "+ ninjaLinkedList);
        System.out.print("Pessoa a ser removida: ");
        String ninjaRemover= scan.nextLine();
        ninjaLinkedList.remove(ninjaRemover);
    }
}

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
        for (int i = 0; i < ninjaLinkedList.size(); i++) {
            System.out.println(i+ " " +ninjaLinkedList.get(i));
        }
        System.out.print("Numero da pessoa a ser removida: ");
        int ninjaRemover= scan.nextInt();
        ninjaLinkedList.remove(ninjaRemover);
    }

    public void acessar(){
        System.out.println("Acessar");
        for (int i = 0; i < ninjaLinkedList.size(); i++) {
            System.out.println(i);
        }
        System.out.print("Numero da pessoa a ser acessada: ");
        int ninjaAcessar= scan.nextInt();
        Ninja escolhido= ninjaLinkedList.get(ninjaAcessar);
        System.out.println("Nome: "+escolhido.getNome());
        System.out.println("Idade: "+escolhido.getIdade());
        System.out.println("Vila: "+escolhido.getVila());
    }

    public void alterar(){
        System.out.println("Alterar");
        for (int i = 0; i < ninjaLinkedList.size(); i++) {
            System.out.println(i);
        }
        System.out.print("Numero da pessoa a ser alterada: ");
        int ninjaAlterar= scan.nextInt();
        scan.nextLine();
        Ninja escolhido= ninjaLinkedList.get(ninjaAlterar);
        System.out.print("Novo nome: ");
        String novoNome= scan.nextLine();
        escolhido.setNome(novoNome);
        System.out.print("Nova idade: ");
        int novaIdade= scan.nextInt();
        scan.nextLine();
        escolhido.setIdade(novaIdade);
        System.out.println("Nova vila: ");
        String novaVila= scan.nextLine();
        escolhido.setVila(novaVila);
        System.out.println("Ninja atualizado: "+ escolhido.toString());
    }
}

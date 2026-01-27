package NIvelIntermediario.EstruturasDeDados.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array normal, estático
        String[] array= new String[3];
        array[0]= "Nome 1";
        array[1]= "Nome 2";
        array[2]= "Nome 3";

        System.out.println("Array estático: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // List, estrutura de dados dinâmica
        List<String> stringList= new ArrayList<>();
        // adicionando elementos
        stringList.add("Nome 1");
        stringList.add("Nome 2");

        System.out.println(stringList);

        // removendo elementos
        stringList.remove("Nome 2");
        System.out.println(stringList);

        // alterando elementos
        stringList.set(0, "Novo nome 1");
        System.out.println(stringList);

        // tamanho da lista
        System.out.println("Tamanho da lista: "+stringList.size());

        // Stack, é uma pilha, o ultimo a entrar é o primeiro a sair

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());
    }
}

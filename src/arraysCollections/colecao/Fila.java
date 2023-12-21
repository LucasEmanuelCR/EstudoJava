package arraysCollections.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        // Criei uma fila para representar uma fila de um banco genérico
        Queue<String> filaBanco = new LinkedList<>();

        // Offer e add -> Adicionam um objeto a fila
        // A diferença está no comportamento no momento que se tenta adicionar um objeto em uma fila cheia

        //Adicionando objetos a fila, que representam pessoas
        filaBanco.add("Ana"); // Retorna uma exceção
        filaBanco.add("Lucas");

        filaBanco.offer("Amanda"); // Restorna false
        filaBanco.offer("Paulo");

        /*
        -> peek e element trazem o proximo elemento da fila (Sem remover)
        -> A diferença está no comportamento quando a lista está vaizia*/

        System.out.println(filaBanco.peek());// Retorna null
        System.out.println(filaBanco.element()); // Retorna um exceção

        System.out.println(filaBanco.size());

         /*-> poll e remove trazem o proximo elemento e o remove da fila
        -> A diferença está no comportamento quando a lista está vaizia*/

        // filaBanco.clear();

        System.out.println(filaBanco.poll()); // Retorna Null
        System.out.println(filaBanco.remove()); // Retorna exceção
        System.out.println(filaBanco.poll());
        System.out.println(filaBanco.remove());

    }
}
/*
Fila
-> First in/first out (fifo)
*/

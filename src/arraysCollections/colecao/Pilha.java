package arraysCollections.colecao;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Piqueno Prícipe");
        livros.add("Narnia");
        livros.push("O diário de um banana");

        for (String livro: livros){
            System.out.println(livro);
        }

        System.out.println(livros.pop());
        System.out.println(livros.remove());
        System.out.println(livros.poll());

    }
}
/*Pilha
-> Last in/First out (Lifo)*/
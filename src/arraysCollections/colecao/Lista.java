package arraysCollections.colecao;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario usuario1 = new Usuario("Lucas");
        Usuario usuario2 = new Usuario("Gustavo");
        Usuario usuario3 = new Usuario("Rian");
        Usuario usuario4 = new Usuario("Pedro");

        lista.add(usuario1);
        lista.add(usuario2);
        lista.add(usuario3);
        lista.add(usuario4);

        lista.add(new Usuario("Ismael"));
        lista.add(new Usuario("Emily"));
        lista.add(new Usuario("Jessica"));

        for (Usuario nome: lista){
            System.out.println(nome.nome);
        }

        System.out.println("Nome de indice 3: " + lista.get(3).nome);
        System.out.println("Nome de indice 7: " + lista.get(0));

        System.out.println(lista.remove(new Usuario("Rian")));
        System.out.println(lista.remove(4));

        System.out.println("Tem? " + lista.contains(new Usuario("Ismael")));

    }
}
/*
List
-> Heterogêneo por padrão
-> Aceita obj. duplicado
-> É ordenado
-> É indexado
*/
package arraysCollections.colecao;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Lucas"));
        usuarios.add(new Usuario("Jessica"));
        usuarios.add(new Usuario("Gustavo"));
        usuarios.add(new Usuario("Guilherme"));

        //Utilizado o HashCode e o equals implantados na classe Usuario para buscar por um usuário
        System.out.print(usuarios.contains(new Usuario("Lucas"))); // É realizado uma busca para identificar se existe esse nome de usuário na coleção
    }
}

package arraysCollections.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>(); // Crio uma coleção do tipo Map para armazenar os usuários

        usuarios.put(1, "Lucas"); // Utilizo o método put para adicionar um novo usuário na coleção usuários
        usuarios.put(34, "Mateus");
        usuarios.put(2, "Amanda");
        usuarios.put(3, "Anandra Machado");

        System.out.println(usuarios.keySet()); // Imprimo todos as chaves que estão amarzanas na coleção usuarios
        System.out.println(usuarios.values()); // Imprimo todas os valores que estão armazenados na coleção usuarios

        usuarios.put(3, "Jessica"); // Troco o usuario da chave 3
        System.out.println("Novo: " + usuarios.values());

        System.out.println("Quantidade de usuários: " + usuarios.size()); // Imprimo quantos usuarios estão armazenados na coleção

        // Realizo um foreach para percorrer e imprimir as chaves da coleção
        for(Integer chave: usuarios.keySet()){
            System.out.println("Chave: " + chave);
        }

        // Utilizo um foreach para percorrer e imprimir os valores da coleção
        for (String nome: usuarios.values()){
            System.out.println("Nome: " + nome);
        }

        for(Entry<Integer, String> usuario: usuarios.entrySet()){
            System.out.print(usuario.getKey() + " -> ");
            System.out.println(usuario.getValue());
        }

    }
}
/*
Map
-> Chave/Valor
-> Chave não aceita repetição
-> Valor Aceita repetição
*/
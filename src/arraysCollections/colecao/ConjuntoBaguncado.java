package arraysCollections.colecao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        // Criei um conjunto do tipo HashSet
        HashSet conjunto = new HashSet();
        conjunto.add("Lucas");
        conjunto.add(19);
        conjunto.add(95.5);
        conjunto.add('O');
        conjunto.add(true);

        System.out.printf("Conteudo do conjunto: %s", conjunto);
        System.out.printf("\nConjunto contem 'Lucas': %b", conjunto.contains("Lucas"));
        System.out.printf("\nRemoveu 'Lucas': %b", conjunto.remove("Lucas"));
        System.out.printf("\nConteudo do conjunto: %s", conjunto);

        Set conjunto2 = new HashSet();

        conjunto2.add(1);
        conjunto2.add(19);
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(95.5);

        System.out.printf("\nConteudo do conjunto 2: %s", conjunto2);

        conjunto2.retainAll(conjunto);
        System.out.printf("\nConteudo do conjunto 2 alterado: %s", conjunto2);

    }
}

/*
SET:
-> Não ordenado por padrão
-> Não indexado
-> Não aceita repetição
-> Pode ser heterogêneo e homogêneo
*/
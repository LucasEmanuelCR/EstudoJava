package arraysCollections.colecao;

import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> conjuntoNomes = new TreeSet<>();
        conjuntoNomes.add("Lucas");
        conjuntoNomes.add("Emily");
        conjuntoNomes.add("Gustavo");
        conjuntoNomes.add("Rian");
        conjuntoNomes.add("Pedro");

        System.out.println("Nomes: ");
        for(String nome: conjuntoNomes){
            System.out.println(nome);
        }

        SortedSet<Integer> conjuntoNum = new TreeSet<>();
        conjuntoNum.add(54);
        conjuntoNum.add(69);
        conjuntoNum.add(789);
        conjuntoNum.add(9999);
        conjuntoNum.add(19);

        System.out.println("Numeros: ");
        for(Integer num: conjuntoNum){
            System.out.println(num);
        }
    }
}

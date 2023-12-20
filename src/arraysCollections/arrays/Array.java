package arraysCollections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner digite = new Scanner(System.in);

        double[] notasAlunoA = new double[3];
        double totalNota = 0;
        double mediaAlunoA;

        for(int i = 0; i < notasAlunoA.length; i++){
            System.out.print("Informe a nota do aluno: ");
            notasAlunoA[i] = digite.nextDouble();
            totalNota += notasAlunoA[i];
        }

        mediaAlunoA = totalNota / notasAlunoA.length;
        System.out.println("A notas do aluno foram: " + Arrays.toString(notasAlunoA));
        System.out.printf("A média do aluno: %.2f", mediaAlunoA);

        digite.close();
    }
}
/*Anotações
    -> Em java Array é uma estrutura para coleção de dados
    -> Array é strutura estática com o tamanho fixo
    -> Uma estrutura que recebe apenas dados Homogêneos
    -> Estrutura indexado
    -> Array é um objeto
    -> Em java é possível colocar um Array dentro de outro Array para formar uma Matriz
 */

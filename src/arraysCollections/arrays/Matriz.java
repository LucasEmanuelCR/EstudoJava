package arraysCollections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        // Utiliza a classe Scanner para receber os dados digitados pelo usuário.
        Scanner digite = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int quantAluno = digite.nextInt();
        System.out.print("Informe a quantidade de notas por aluno: ");
        int quantNotas = digite.nextInt();

        // Define a Matriz com as quantidades de alunos e notas informadas pelo usuário.
        double[][] notasSala = new double[quantAluno][quantNotas];

        // Utiliza dois laços for para solicitar as notas ao usuário, armazená-las na Matriz e somá-las na variável total
        double total = 0;
        for (int i = 0; i < notasSala.length; i++){
            for (int n = 0; n < notasSala[i].length; n++){
                System.out.printf("Informe a %d° nota %d° aluno: \n",n + 1 , i + 1);
                notasSala[i][n] = digite.nextDouble();
                total += notasSala[i][n];
            }
        }

        // Utiliza a estrutura foreach para imprimir os valores armazenados dentro da Matriz
        System.out.println("As notas digitadas foram:");
        int aluno = 1;
        for(double[] notasAluno: notasSala){
            System.out.print("Aluno " + aluno + ": " + Arrays.toString(notasAluno) + "\n");
            aluno++;
        }

        // Calcula a média da turma e a exibe na tela
        double mediaTurma = total / (quantAluno * quantNotas);
        System.out.printf("\nMédia da turma: %.2f: ", mediaTurma);

        // Finaliza o Scanner para liberar recursos
        digite.close();
    }
}

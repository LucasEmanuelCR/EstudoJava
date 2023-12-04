package arrays;

import java.util.Scanner;

// Calcula a média das notas de um aluno
// O programa solicita ao usuário que informe a quantidade de notas a serem inseridas
// O algoritmo é dividido em dois laços for
// O primeiro for é utilizado para armazenar as notas no Array
// Utiliza o método foreach para somar as notas
// Ao final, a média é apresentada ao usuário
public class DesafioArray {
    public static void main(String[] args) {
        // Utiliza a classe Scanner para obter entrada do usuário
        Scanner digite = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int quantidadeNotas = digite.nextInt();

        // Define o tamanho do Array com base na quantidade de notas informada pelo usuário
        double[] notasAluno = new double[quantidadeNotas];

        // Utiliza um laço for para percorrer o Array e solicitar as notas do aluno, armazenando-as no Array
        for(int i = 0; i < notasAluno.length; i++){
            System.out.printf("Informe a %d° nota: ", i+1);
            notasAluno[i] = digite.nextDouble();
        }

        // Utiliza o método foreach para percorrer todos os valores do Array e somá-los na variável totalNotas
        double totalNotas = 0;
        for(double nota: notasAluno){
            totalNotas += nota;
        }

        // Calcula a média do aluno dividindo o total das notas pelo tamanho do Array
        double mediaAluno = totalNotas / notasAluno.length;
        System.out.printf("Media do Aluno: %.2f", mediaAluno);

        // Fecha o Scanner para liberar os recursos após a conclusão do programa
        digite.close();
    }
}

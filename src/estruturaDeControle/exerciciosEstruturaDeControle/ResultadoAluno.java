package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class ResultadoAluno {
    public static void main(String[] args) {
        /* 3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for
        maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0
        imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
        */

        Scanner entry = new Scanner(System.in);

        double media;
        double total = 0;
        int n = 0;

        for(; n <= 1; n++){

            System.out.print("Informe uma nota: ");
            double nota = entry.nextDouble();
            total = total + nota;

        }
        media = total / n;

        if(media >= 7){

            System.out.println("Aprovado");

        } else if (media < 7 && media > 4) {

            System.out.println("Recuperação");

        }else{

            System.out.println("Reprovado");

        }
        entry.close();
    }
}

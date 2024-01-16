package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class SomatoriaNumerosPositivos {
    public static void main(String[] args) {
        /*7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console
        a soma dos números inseridos, caso receba um número negativo, encerre o programa.
        Tente utilizar a estrutura do while.
        */

        Scanner entry = new Scanner(System.in);
        double numDigitado;
        double resultadoSoma = 0;

        do{


            System.out.print("\nDigite um número: ");
            numDigitado = entry.nextDouble();
            if(numDigitado > 0) {
                System.out.printf("\n%.2f + %.2f = ", numDigitado, resultadoSoma);
                resultadoSoma += numDigitado;
                System.out.printf("%.2f", resultadoSoma);
            }else
                break;

        }while(true);

        entry.close();

    }
}
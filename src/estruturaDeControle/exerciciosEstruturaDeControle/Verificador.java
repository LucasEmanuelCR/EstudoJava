package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) {
        // 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner entry = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        double numDigitado = entry.nextDouble();

        if ((numDigitado * 10) % 10 == 0){
            if(numDigitado >= 0 && numDigitado <= 10){
                System.out.printf("%.0f está entre 0 e 10\n", numDigitado);
                if(numDigitado % 2 == 0){
                    System.out.printf("%.0f é um número par", numDigitado);
                }
            }
        }else {
            System.out.println("Número digitado não é inteiro");
        }

        entry.close();
    }
}

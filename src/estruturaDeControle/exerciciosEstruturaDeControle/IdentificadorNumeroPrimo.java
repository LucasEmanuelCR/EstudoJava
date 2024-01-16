package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class IdentificadorNumeroPrimo {
    public static void main(String[] args) {
        // 4. Criar um programa que receba um número e diga se ele é um número primo.

        Scanner entry = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entry.nextInt();
        int contador = 0;
        for(int n = 1; n <= num; n++){
            if(num % n == 0){
                contador++;
            }
        }

        if(contador == 2){
            System.out.printf("O numero %d é um número primo", num);
        }else {
            System.out.printf("O numero %d não é um número primo", num);
        }

        entry.close();
    }
}

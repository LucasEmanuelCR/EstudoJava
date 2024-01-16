package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        // 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.

        Scanner digite = new Scanner(System.in);
        int numMaior = 0;

        for(int i = 10; i > 0; i--){

            System.out.print("Digete um número: ");
            int num = digite.nextInt();

            if(num > numMaior){
                numMaior = num;
            }

        }
        System.out.printf("Entre os 10 número digitador o maior é %d", numMaior);
        digite.close();
    }
}

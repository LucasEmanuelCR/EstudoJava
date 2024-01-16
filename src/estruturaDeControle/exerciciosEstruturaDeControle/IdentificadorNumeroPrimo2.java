package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class IdentificadorNumeroPrimo2 {
    public static void main(String[] args) {
        // 5. Refatorar o exercício 04, utilizando a estrutura switch.

        Scanner digite = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = digite.nextInt();
        int contador = 0;

        for (int a = 1; a <= num; a++) {
            switch (num % a) {
                case 0:{
                    contador++;
                    break;
                }
            }
        }

        switch (contador){
            case 2:
                System.out.printf("O número %d é um número primo", num);
                break;
            default:
                System.out.printf("O número %d não é um número primo", num);
        }

        digite.close();
    }
}

package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        /*6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero
        aleatório emuma variável. O Jogador tem 10 tentativas para adivinhar o número gerado.
        Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima
         se o número inserido é maior ou menor do que o número armazenado.
         */

        Scanner digite = new Scanner(System.in);
        Random gerador = new Random();
        int num;
        int numSorteado = gerador.nextInt(100);

        for(int tentativas = 10; tentativas >= 1; tentativas--){
            System.out.printf("Você tem apenas %d tentativas\n", tentativas);
            System.out.print("Digie um número: ");
            num = digite.nextInt();
            if(num == numSorteado){
                System.out.printf("Você adivinhou o número! O número sorteado foi %d\n", numSorteado);
                break;
            }else if (num > numSorteado) {
                System.out.printf("O número %d é maior do que o número sorteado\n", num);
            }else {
                System.out.printf("O número %d é menor do que o número sorteado\n", num);
            }
        }
        digite.close();
    }

}

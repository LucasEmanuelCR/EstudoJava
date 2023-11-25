package estruturaDeControle;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = entry.nextInt();

        if(num1 % 2 == 0){
            System.out.printf("%d é um número par", num1);
        }else{
            System.out.printf("%d é um número ímpar", num1);
        }

    }
}

/*Anotações:
    -> Podemos adicionar ao 'if' um 'else' que será execultado caso a sentença do if seja false.
 */

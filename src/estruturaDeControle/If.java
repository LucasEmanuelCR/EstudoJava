package estruturaDeControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Você tem quantos anos? ");
        Integer idade = entry.nextInt();

        if(idade < 18)
            System.out.printf("Ainda faltam %d anos para que você possa dirigir", 18 - idade);
        if(idade >= 18)
            System.out.println("Você já tem idade para dirigir.");
    }
}
/*Anotações:
    -> "if" é uma estrutura condicional.
    -> Para que um código que esteja dentro do if seja executado ou não, é necessário que a expressão dentro do 'if' retorne um valor booleano.
    -> Se o resultado do IF for false, o código não será usado; se for true, o código será executado.
*/
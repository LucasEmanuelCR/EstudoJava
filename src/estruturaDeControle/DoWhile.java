package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String texto;
        do {
            System.out.println("Para você sair deve dizer as palavras mágicas...");
            System.out.print("Deseja sair?");
            texto = entry.nextLine();

        }while(!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado!");

        entry.close();
    }
}

/*Anotações:
    -> 'do/while' é uma estrutura de repetição.
    -> 'do/while' é uma estrutura que será execultada pelo menos uma vez.
 */
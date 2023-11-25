package estruturaDeControle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        float nota = entry.nextFloat();

        if(nota > 10 || nota < 0){
            System.out.println("Nota inválida");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Conceito D");
        }else {
            System.out.println("Conceito E");
        }
        entry.close();
    }
}
/*Anotações:
    -> Posso adicionar em uma estrutura 'if' o 'else if', onde terá uma nova
     condição que será analisada se a condição do primeiro 'if' for falsa.
 */
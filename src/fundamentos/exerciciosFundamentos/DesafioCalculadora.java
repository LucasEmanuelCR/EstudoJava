package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class DesafioCalculadora{
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        System.out.println("Qual Operação você deseja realizar?");
        System.out.println("('+', '-', '*' ou '/')");
        System.out.print("Escolha: ");
        String operador = digite.nextLine();

        String mensagem = operador.equals("+") || operador.equals("-") || operador.equals("*") ||
            operador.equals("/") ? "Operador valido" : "Operador invalido";

        System.out.print("Digite o primeiro número: ");
        Double num1 = digite.nextDouble();

        System.out.print("Digite o primeiro número: ");
        Double num2 = digite.nextDouble();

        Double resultado = operador.equals("+") ? num1 + num2 : num1 / num2;
        resultado = operador.equals("-")  ? num1 - num2 : num1 / num2;
        resultado = operador.equals("*")  ? num1 * num2 : num1 / num2 ;

        System.out.println("Resultado: " + (mensagem.equals("Operador invalido") ? mensagem : resultado));

    }
}
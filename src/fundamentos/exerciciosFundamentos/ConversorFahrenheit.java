package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class ConversorFahrenheit {

    public static void main(String[] args) {
        System.out.println("|----------------------------------------|");
        System.out.println("|  Conversor de Fahrenheit para Celsius  |");
        System.out.println("|----------------------------------------|");

        Scanner digite = new Scanner(System.in);
        System.out.print  ("|      Digite o Grau em Fehrenheit:");
        double grausFah = digite.nextDouble();

        double num1 = grausFah - 32;
        double resultado = num1 * (9/5);

        System.out.printf("|       %.2f°F equivalem a %.2f°C       \n", grausFah, resultado);
        System.out.println("|----------------------------------------|");

        digite.close();
    }

}

package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class ConversorCelsius {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Convesor de graus Celsius para Fahrenheit");
        System.out.print("- Digite o graus Celsiu: ");
        Double grausCelsiu = entry.nextDouble();

        double num1 = grausCelsiu * 1.8;
        double grusFah = num1 + 32;

        System.out.printf("%.2f°C equivale a %.2f°C", grausCelsiu, grusFah);

        entry.close();
    }
}

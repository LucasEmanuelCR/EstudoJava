package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner informe = new Scanner(System.in);

        System.out.println("\n--> Calcule se IMC <--\n\n");
        System.out.println("Digite seu peso e sua altura logo abaixo =>");
        System.out.print("Peso: ");
        double peso = informe.nextDouble();

        System.out.print("Altura: ");
        double altura = informe.nextDouble();

        double calculo = Math.pow(altura, 2);
        double calculoImc = peso / calculo;

        System.out.printf("Seu IMC é %.2f", calculoImc);

        informe.close();
    }
}

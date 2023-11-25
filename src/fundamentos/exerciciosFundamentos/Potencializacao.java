package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class Potencializacao {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Dite um número: ");
        float num1 = entry.nextFloat();

        float numQuadrado = (float) Math.pow(num1, 2);
        float numCubo = (float) Math.pow(num1, 3);

        System.out.printf("O %.2f ao cubo é %.2f\nO %.2f ao Quadrado é %.2f", num1, numCubo, num1, numQuadrado);

        entry.close();
    }
}

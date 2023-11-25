package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        //(ax2 + bx + c = 0)

        Double incognita1 = 0.0;
        Double incognita2 = 0.0;
        Double coeficienteQuadratico = 0.0;
        Double coeficienteLinear = 0.0;
        Double coeficienteConstante = 0.0;

        Scanner entry = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        coeficienteQuadratico = entry.nextDouble();
        System.out.print("Digite o valor de B: ");
        coeficienteLinear = entry.nextDouble();
        System.out.print("Digite o valor de C: ");
        coeficienteConstante = entry.nextDouble();

        Double calculo1 = Math.pow(coeficienteLinear, 2);
        Double delta = calculo1 - (4 * coeficienteQuadratico * coeficienteConstante);

        Double calculo2 = -coeficienteLinear + (Math.pow(delta, 2));
        Double calculo3 = -coeficienteLinear - (Math.pow(delta, 2));
        Double calculo4 = 2 * coeficienteQuadratico;

        incognita1 = calculo2 / calculo4;
        incognita2 = calculo3 / calculo4;

        System.out.printf("X = %2.2f", incognita1);
        System.out.printf("\nX = %2.2f", incognita2);

        entry.close();
    }
}

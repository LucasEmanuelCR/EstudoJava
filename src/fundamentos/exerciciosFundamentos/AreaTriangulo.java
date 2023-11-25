package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Informe a Base e a Atura para saber a área");
        System.out.print("Base: ");
        double base = entry.nextDouble();
        System.out.print("Altura: ");
        double altura = entry.nextDouble();

        double area = base * altura;

        System.out.println("A área do seu triangulo é " + area);

        entry.close();
    } 
}
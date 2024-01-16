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

        String situcao = calculoImc < 18.5 ? "Baixo Peso" : "Obesidade Móbida";
        situcao = calculoImc >= 18.5 || calculoImc < 24.9 ? "Peso Normal" : situcao;
        situcao = calculoImc >= 24.9 || calculoImc < 29.9 ? "Excesso de Peso" : situcao;
        situcao = calculoImc >= 29.9 || calculoImc < 34.9 ? "Obesidade Classe I" : situcao;
        situcao = calculoImc >= 34.9 || calculoImc < 39.9 ? "Obesidade Classe II" : situcao;

        System.out.printf("Seu IMC é %.2f\n", calculoImc);
        System.out.printf("Você está com %s\n", situcao);

        informe.close();
    }
}

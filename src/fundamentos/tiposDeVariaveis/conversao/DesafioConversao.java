package fundamentos.tiposDeVariaveis.conversao;

import java.util.Scanner;

public class DesafioConversao {
    // Últimos três salários de um funcionário
    // Calcular a média
    // O usuário deve digitar o valor, independentemente se for com vírgula ou ponto
    public static void main(String[] args) {

        System.out.println("====================Média salarial====================");
        System.out.println("Digite o valor dos seus três últimos slarários");

        Scanner digite = new Scanner(System.in);

        System.out.print("Primeiro Sálario: ");
        String primeiroSalario = digite.nextLine().replace(",", ".");

        System.out.print("Segundo Sálario: ");
        String segundoSalario = digite.nextLine().replace(",", ".");

        System.out.print("Terceiro Sálario: ");
        String terceiroSalario = digite.nextLine().replace(",", ".");

        Double primeiroSalarioConvertido = Double.parseDouble(primeiroSalario);
        Double segundoSalarioConvertido = Double.parseDouble(segundoSalario);
        Double terceiroSalarioConvertido = Double.parseDouble(terceiroSalario);

        Double media = (primeiroSalarioConvertido + segundoSalarioConvertido + terceiroSalarioConvertido) / 3;

        System.out.printf("Sua média salárial é: %.2f", media);

        digite.close();
    }

}

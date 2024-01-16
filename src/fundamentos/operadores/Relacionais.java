package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        Double salario = 25000.00;
        final Double salarioMinimo = 1320.00;

        Double quantidadeSalariosMinimo = salario / salarioMinimo;

        System.out.printf("Clase A: %b", quantidadeSalariosMinimo >= 20);
        System.out.printf("\nClase B: %b", quantidadeSalariosMinimo >= 10 && quantidadeSalariosMinimo < 20);
        System.out.printf("\nClase C: %b", quantidadeSalariosMinimo >= 4 && quantidadeSalariosMinimo < 10);
        System.out.printf("\nClase D: %b", quantidadeSalariosMinimo >= 2 && quantidadeSalariosMinimo < 4);
        System.out.printf("\nClase E: %b", quantidadeSalariosMinimo < 2);

    }
}
/*Anotações:
    -Em Java, existem cinco operadores relacionais. Eles são: == (Igual), != (Diferente),
    > (Maior), >= (Maior ou igual), < (Menor) e <= (Menor ou igual).
 */
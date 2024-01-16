package fundamentos.variaveisEConstantes;

public class DesafioTemperatura {
    public static void main(String[] args) {
        // (F-32)*5/9=C

        final int ajuste = 32;
        final double fator = 5.0/9;
        double fahrenheit = 86;

        double calculo1 = fahrenheit - ajuste;
        double c = calculo1 * fator;

        System.out.println("A conversão = " + c + "c°");


    }
}

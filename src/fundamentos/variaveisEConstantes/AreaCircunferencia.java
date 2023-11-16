package fundamentos.variaveisEConstantes;

public class AreaCircunferencia {

    public static void main(String[] args) {

        double raio = 3.4;
        final double pi = 3.1415;

        double area = pi * raio * raio;

        System.out.println("Area = " + area);
    }
}
/*Anotações:
- Variável é um espaço na memória alocado para armazenar um determinado tipo.
- Constante é quando o valor da variável é fixo. Em Java, é definido pela palavra-chave 'final'.
*/

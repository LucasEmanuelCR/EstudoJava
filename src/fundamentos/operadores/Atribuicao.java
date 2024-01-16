package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        double num1 = 30;
        double num2 = 65;

        String comparacao = num1 > num2 ? "Maior." : "Menor";
        System.out.println(comparacao);

        double a = 30;
        double b = 65;
        a = b + a;
        b = a - b;
        a = b * a;
        b = a / b;
        a = a % b;

        double c = 30;
        double d = 65;
        c += d;
        d -= c;
        c *= d;
        d /= c;
        c %= d;

        ++a;
        --b;

        a++;
        b--;

        System.out.printf("%f e %f\n", a, b);
        System.out.printf("%f e %f\n", c, d);
    }
}

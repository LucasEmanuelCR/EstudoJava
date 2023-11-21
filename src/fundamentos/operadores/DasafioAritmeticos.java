package fundamentos.operadores;

public class DasafioAritmeticos {
    public static void main(String[] args) {
        double valor1  = Math.pow(6*(3+2), 2);
        double valor2 = 3*2;

        double valor3 = (1-5) * (2-7);
        double valor4 = 2;

        double superiorA = valor1 / valor2;
        double superiorB = Math.pow((valor3 / valor4), 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior =Math.pow(10,3);
        double resultado = superior / inferior;

        System.out.println(resultado);

    }
}

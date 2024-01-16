package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        var n1 = 700.99;
        Double n2  = 4.66;

        System.out.printf("\nAdção de %f e %f = %f", n1, n2, n1+n2);
        System.out.printf("\n\nSubtração de %f e %f = %f", n1, n2, n1-n2);
        System.out.printf("\n\nMultiplicação de %f e %f = %f", n1, n2, n1*n2);
        System.out.printf("\n\nDivição de %f e %f = %f", n1, n2, n1/n2);

        Integer n3 = 1999;
        int n4  = 55;

        System.out.printf("\n\nAdção de %d e %d = %d", n3, n4, n3+n4);
        System.out.printf("\n\nSubtração de %d e %d = %d", n3, n4, n3-n4);
        System.out.printf("\n\nMultiplicação dde %d e %d = %d", n3, n4, n3*n4);
        System.out.printf("\n\nDivição de %d e %d = %d", n3, n4, n3/n4);
    }
}

/*Anotações
    - Operadores unários são quando o operador está calculando um operando.
    - Operadores binários são quando o operador está calculando dois operandos.
    - Operadores ternários são quando o operador está calculando três operandos.

    - Quando o operador está antes do operando, é chamado de modo prefixo e tem preferencia em uma comparação.
    - Quando o operador está depois do operando, é chamado de modo postfix.
    - Quando o operador está entre dois operandos, é chamado de modo infix.
 */

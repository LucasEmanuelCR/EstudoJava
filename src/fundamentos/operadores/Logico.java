package fundamentos.operadores;

public class Logico {
    public static void main(String[] args) {

        System.out.println("Tabela verdade && (AND): ");
        System.out.printf("VERDADEIRO && VERDADEIRO = %b\n", true && true);
        System.out.printf("VERDADEIRO && FALSO      = %b\n", true && false);
        System.out.printf("FALSO      && VERDADEIRO = %b\n", false && true);
        System.out.printf("FALSO      && FALSO      = %b\n", false && false);

        System.out.println("Tabela verdade || (OR): ");
        System.out.printf("VERDADEIRO || VERDADEIRO = %b%n", true || true);
        System.out.printf("VERDADEIRO || FALSO      = %b%n", true || false);
        System.out.printf("FALSO      || VERDADEIRO = %b%n", false || true);
        System.out.printf("FALSO      || FALSO      = %b%n", false || false);

        System.out.println("Tabela verdade ^ (XOR): ");
        System.out.printf("VERDADEIRO ^  VERDADEIRO = %b%n", true ^ true);
        System.out.printf("VERDADEIRO ^  FALSO      = %b%n", true ^ false);
        System.out.printf("FALSO      ^  VERDADEIRO = %b%n", false ^ true);
        System.out.printf("FALSO      ^  FALSO      = %b%n", false ^ false);

        System.out.println("Tabela verdade ! (NOT): ");
        System.out.printf("!VERDADEIRO = %b%n", !true);
        System.out.printf("!FALSO      = %b%n ", !false);


    }
}
/*Anotções:
    - Java possui quatro operadores lógicos, são eles: &&, ||, ^ e !.
    - O operador && só retornará verdadeiro caso as duas operações sejam verdadeiras.
    - O operador || só retornará verdadeiro caso alguma operação seja verdadeira.
    - O operador ^ só retornará verdadeiro caso apenas uma operação seja verdadeira.
    - O operador ! inverte a operação.
 */
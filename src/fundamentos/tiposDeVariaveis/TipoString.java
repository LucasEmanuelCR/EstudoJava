package fundamentos.tiposDeVariaveis;

import java.awt.*;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".toUpperCase());
        String a = "Boa tarde";
        System.out.println(a.startsWith("BOA"));
        System.out.println(a.toUpperCase().startsWith("BOA"));

        var nome = "Lucas";
        var salario = 1_900.7804;

        System.out.printf("\nMeu nome é %s e eu recebo %.2f", nome, salario);
    }
}

/*Anotações:
    - O tipo 'String' não é um tipo primitivo.
    - O tipo 'String' é um objeto imutável.
    - É possível criar uma variável do tipo String com 'var'
 */
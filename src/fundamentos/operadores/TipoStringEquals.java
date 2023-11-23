package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("'S' é igual a 'S'? " +
                ("s" == "s" ? "Verdade" : "Mentira"));

        String letra = new String("S");
        System.out.println("'S' é igual a 'S'? " +
                (letra == "S" ? "Verdade" : "Mentira"));

        Scanner digite = new Scanner(System.in);
        System.out.print("Digite a letra 'S': ");
        letra = digite.nextLine();
        System.out.println("'S' é igual a 'S'? " +
                (letra == "S" ? "Verdade" : "Mentira"));

        System.out.println("\n\nUtiliando o Equals");
        System.out.println("'S' é igual a 'S'? " +
                ("S".equals("S") ? "Verdade" : "Mentira"));

        String letra2 = new String("S");
        System.out.println("'S' é igual a 'S'? " +
                (letra2.equals("S") ? "Verdade" : "Mentira"));

        System.out.print("Digite a letra 'S': ");
        letra2 = digite.nextLine();
        System.out.println("'S' é igual a 'S'? " +
                (letra2.equals("S") ? "Verdade" : "Mentira"));

        digite.close();

    }
}

/*Anotações
    -Nem toda String pode ser comparada utilizando o ==;
    -Para comparar duas Strings, o Java possui a função .equals.
*/

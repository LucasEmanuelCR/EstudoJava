package fundamentos.tiposDeVariaveis.conversao;

public class ConversaoDeTiposPrimitivo {
    public static void main(String[] args) {

        double n = 1200.80;
        System.out.printf("Antes do CAST: %.2f", n);
        int b = (int) n;
        System.out.printf("\nDepois do CAST: %d", b);

        int n3 = 1000;
        System.out.printf("\nAntes do CAST: %d", n3);
        byte n4 = (byte) n3;
        System.out.printf("\nDepois do CAST: %d", n4);

        double n5 = 19451.988725;
        System.out.printf("\nAntes do CAST: %f", n5);
        float n6 = (float) n5;
        System.out.printf("\nDepois do CAST: %f", n6);

    }
}
/*Anotações:
    - Uma conversão realizada de um tipo menor para o meior, o Java realiza de forma implicita
    - Uma convesrão realizada de um tipo maior para o menor deve ser realizada de uma forma explicita
    - Para realizar uma conversão explicita é utilizado o método CAST
*/
package fundamentos.tiposDeVariaveis.conversao;

import javax.swing.JOptionPane;
public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer n1 = 10;
        System.out.printf("O tipo da variável n1 é %s", n1.toString().getClass().getSimpleName());
        Byte n2 = 100;
        System.out.printf("\nO tipo da variável é %s", ("" + n2).getClass().getSimpleName());

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        Integer valorConvertido1 = Integer.parseInt(valor1);
        Short valorConvertido2 = Short.parseShort(valor1);
        System.out.printf("\nO tipo da variável é %s", valorConvertido1.getClass().getSimpleName());
        System.out.printf("\nO tipo da variável é %s", valorConvertido2.getClass().getSimpleName());
    }
}
/*Anotações:
    - É possível converter um número para String utilizando a função  '.toString()' ou concatenando
    o número a uma String.
    - É possível transformar uma String em número utililizando a função '.parse + tipo que você
    quer converter()', desde do momento que a String seja um número valido.
 */
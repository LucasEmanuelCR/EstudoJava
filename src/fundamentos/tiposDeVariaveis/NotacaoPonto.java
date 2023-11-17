package fundamentos.tiposDeVariaveis;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";

        s = s.replace("X", "Lucas");
        s = s.toUpperCase();

        System.out.println(s);
        System.out.println("Lucas".toUpperCase());
    }
}
/* Anotações:
   - A notação ponto serve para chamar uma funcionalidade de um dado.
   - Tipos primitivos não tem o operador '.'
*/
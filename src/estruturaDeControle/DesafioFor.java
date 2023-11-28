package estruturaDeControle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for (; !valor.equals("######"); valor += "#"){
            System.out.println(valor);
        }

    }
}
// Não pode usar valor número para controlar o laço

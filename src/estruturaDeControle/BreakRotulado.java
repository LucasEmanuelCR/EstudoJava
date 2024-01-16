package estruturaDeControle;

public class BreakRotulado {
    public static void main(String[] args) {

        externo: for(int a = 10; a >= 0; a--) {
            interno:
            for (int n = 0; n <= 10; n++) {
                System.out.printf("[%d %d] ", a, n);
                break interno;
            }
        }
    }
}

/*Anotções:
    -> É possível rotular uma estrutura de repetição e associá-la ao 'break', dessa forma a estrutura informada será interrompida.
    -> Não é recomendado o uso do 'break rotulado'.
 */

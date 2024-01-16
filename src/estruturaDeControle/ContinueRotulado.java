package estruturaDeControle;

public class ContinueRotulado {
    public static void main(String[] args) {
        externo: for (int n = 10; n >= 0; n--  ){
            for (int a = 10; a >= 0; a--  ){
                continue externo;
            }
        }
    }
}
/*Anotções:
        -> É possível rotular uma estrutura de repetição e associá-la ao 'continue', dessa forma a iteração atual da estrutura informada será interrompida.
        -> Não é recomendado o uso do 'coninue rotulado'.
 */
package estruturaDeControle;

public class Break {
    public static void main(String[] args) {
        for(int i = 10; i >= 0; i--){
            System.out.print(i + " ");
            if(i==4){
                break;
            }
        }
    }
}
/*Anotações:
    -> A palavra-chave 'break' em Java é utilizada para interromper um fluxo de repetição.
 */
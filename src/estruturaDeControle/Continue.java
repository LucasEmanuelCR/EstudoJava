package estruturaDeControle;

public class Continue {
    public static void main(String[] args) {
        for(int j = 0; j <= 10; j++) {
            if(j % 2 == 1){
                continue;
            }
            System.out.println(j);
        }
    }
}
/*Anotações:
    -> A palavra-chave "continue" é utilizada para interromper uma iteração;
 */
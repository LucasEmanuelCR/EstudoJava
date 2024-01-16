package estruturaDeControle;

public class For3 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            for (int n = 0; n <= 10; n++){
                System.out.printf("[%d : %d]", i, n);
            }
            System.out.println();
        }
    }
}

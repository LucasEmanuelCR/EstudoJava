package estruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String resposta = "";
       while (!resposta.equalsIgnoreCase("sair")){
           System.out.print("Digite algo: ");
           resposta = entry.nextLine();
       }

        entry.close();

    }

}

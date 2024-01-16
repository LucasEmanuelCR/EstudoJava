package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class IdentificadoAnoBissexto {
    public static void main(String[] args) {
        // 2. Criar um programa informa se o ano atual é um ano bissexto;

        Scanner entry = new Scanner(System.in);
        System.out.print("Informe um ano: ");
        int ano = entry.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0){
            System.out.printf("O ano %d é um ano bissexto.", ano);
        }else {
            System.out.printf("O ano %d não é um ano bissexto.", ano);
        }
        entry.close();
    }
}

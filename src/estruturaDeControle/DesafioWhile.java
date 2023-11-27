package estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float nota = 0.0F;
        float totalNota = 0.0F;
        byte contador = 0;
        while (nota != -1){
            System.out.print("Digite a nota: ");
            nota = entry.nextFloat();
            if((nota >= 0 && nota <= 10)){
                totalNota += nota;
                contador++;
            }else if(nota != -1){
                System.out.println("Nota invalida");
            }
        }
        float media = totalNota / contador;
        System.out.printf("Média: %.2f", media );

        entry.close();
    }
}

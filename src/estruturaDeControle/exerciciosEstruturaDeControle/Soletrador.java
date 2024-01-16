package estruturaDeControle.exerciciosEstruturaDeControle;

import java.util.Scanner;

public class Soletrador {
    public static void main(String[] args) {

        // 8. Criar um programa que receba uma palavra e imprime no console letra por letra.

        Scanner digite = new Scanner(System.in);

        System.out.print("Digite UMA palavra: ");
        String palavra = digite.next();

        for(int i = 0; i < palavra.length(); i++){
            System.out.print("\n" + palavra.charAt(i));
        }

        digite.close();

    }
}

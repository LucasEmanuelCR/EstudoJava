package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.println("Olá! Bom dia!");
        System.out.println("Preencha o formulário");

        Scanner digite = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = digite.nextLine();
        System.out.print("Digite sua idade: ");
        int idadeUsuario = digite.nextInt();

        System.out.printf("Nome: %s\n", nomeUsuario);
        System.out.printf("Idade: %d", idadeUsuario);

        digite.close();

    }
}
/*Anotações:
    - É possível imprimir ou digitar dados no console.
    - Ao utilizar o .nextInt é necessário lipar o buffer de entrada.
 */
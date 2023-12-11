package classe.desafioModulo;

import java.util.Scanner;

public class Jantar {

    public static void main(String[] args) {
        // Utilizo a classe Scanner para receber os dados do usuário.
        Scanner digite = new Scanner(System.in);

        // Instancio um objeto do tipo de pessoa representando uma pessoa
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa.nome = digite.nextLine();
        System.out.print("Digite seu peso: ");
        pessoa.peso = digite.nextDouble();


        // Instancio diversos objetos do tipo comida representando o cardápio
        Comida comida1 = new Comida("Arroz", 0.99);
        Comida comida2 = new Comida("feijao", 0.67);
        Comida comida3 = new Comida("frango", 0.81);
        Comida comida4 = new Comida("suco", 0.35);

        System.out.println("--------------------");
        System.out.println("Status da pessoa ");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Peso: " + pessoa.peso);
        System.out.println("--------------------");

        String seAlimentar;
        do {
            // Peço para o usuário informar qual 'comida' ele deseja solecionar
            System.out.printf("Cardapio: \n[1] %s\n[2] %s\n[3] %s\n[4] %s\n", comida1.nome, comida2.nome, comida3.nome, comida4.nome);
            System.out.print("Escolha a comida digitando seu digito: ");
            int escolha = digite.nextInt();

            // Verifico a escolha do usuário e incremento ao peso da 'comida' ao peso da 'pessoa'
            switch (escolha) {
                case 1:
                    pessoa.comerComida(comida1);
                    break;
                case 2:
                    pessoa.comerComida(comida2);
                    break;
                case 3:
                    pessoa.comerComida(comida3);
                    break;
                case 4:
                    pessoa.comerComida(comida4);
                    break;
                default:
                    System.out.println("Escolha incoreta");
            }

            // Apresento as informações da 'pessoa'
            System.out.println("--------------------");
            System.out.println("Status da pessoa ");
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Peso: " + pessoa.peso);
            System.out.println("--------------------");

            // Pergunto ao usuário deseja repetir o mesmo procedimento
            System.out.print("Digite 'S' para se alimentar novamente: ");
            seAlimentar = digite.next();

        } while (seAlimentar.equalsIgnoreCase("S")); // Verifico se a responsta do usuário

        // Fechar o Scanner após o uso para evitar vazamento de recursos.
        digite.close();
    }
}

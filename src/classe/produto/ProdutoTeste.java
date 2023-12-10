package classe.produto;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        // Utilizo a classe Scanner para receber os dados do usuário.
        Scanner digite = new Scanner(System.in);

        // Instâncio um objeto do tipo Produto informando no construtor nome e valor.
        Produto produto1 = new Produto("Computador", 10000.00);
        // Instâncio um objeto do tipo Produto informando no construtor nome e valor
        var produto2 = new Produto("Celular", 2509.05);

        //Apreseto as informções de cada produto
        System.out.println("1° Produto: " + produto1.nome);
        System.out.println("Valor: R$" + produto1.valor);
        System.out.println("Desconto: " + (produto1.desconto * 100) + "%");
        System.out.println("Valor com desconto: " + produto1.precoComDesconto());


        // Altero o desconto, assim alterando o valor do atributo da classe.
        Produto.desconto = 0.69;

        //Apreseto as informções de cada produto
        System.out.println("\n2° Produto: " + produto2.valor);
        System.out.println("Valor: R$" + produto2.valor);
        System.out.println("Desconto: " + (produto2.desconto * 100) + "%");
        System.out.println("Valor com desconto: " + produto2.precoComDesconto());

        // Fechar o Scanner após o uso para evitar vazamento de recursos.
        digite.close();
    }
}

package classe.produto;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        // Utilizo a classe Scanner para receber os dados do usuário.
        Scanner digite = new Scanner(System.in);

        // Instâncio um objeto do tipo Produto e solicito que o usuário realize o cadastro das informações.
        Produto produto1 = new Produto();
        System.out.println("Informe sua lista de compra");
        System.out.println("Informações do primeiro produto comprado:  ");
        System.out.print("Nome: ");
        produto1.nome = digite.nextLine();
        System.out.print("Valor: ");
        produto1.valor = digite.nextDouble();
        System.out.print("Desconto: ");
        produto1.desconto = digite.nextDouble();
        digite.nextLine();

        // Instâncio um segundo objeto do tipo Produto e solicito que o usuário realize o cadastro das informações.
        var produto2 = new Produto();
        System.out.println("Informações do segundo produto comprado:  ");
        System.out.print("Nome: ");
        produto2.nome = digite.nextLine();
        System.out.print("Valor: ");
        produto2.valor = digite.nextDouble();
        System.out.print("Desconto: ");
        produto2.desconto = digite.nextDouble();

        // Apresento o valor dos produtos listados, a soma do valor bruto e o total após os descontos em cada produto.
        System.out.println("------------------------------");
        System.out.printf("Produtos na lista: %s e %s. \n", produto1.nome, produto2.nome);
        System.out.printf("Valor bruto da compra: R$%.2f.\n", produto1.valor + produto2.valor);
        System.out.printf("Valor com os desconto de cada produto: R$%.2f.\n",
                produto1.precoComDesconto() + produto2.precoComDesconto());

        // Fechar o Scanner após o uso para evitar vazamento de recursos.
        digite.close();
    }
}

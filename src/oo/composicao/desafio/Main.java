package oo.composicao.desafio;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Oi");

        Cliente cliente1 = new Cliente("Lucas");

        Produto produto1 = new Produto("Arroz", 22.99);
        Produto produto2 = new Produto("Feijão", 19.99);
        Produto produto3 = new Produto("Leite", 5.99);
        Produto produto4 = new Produto("Ovo", 1.50);

        Item item1 = new Item(produto1, 1);
        Item item2 = new Item(produto2, 2);
        Item item3 = new Item(produto3, 9);
        Item item4 = new Item(produto4, 30);

        Compra compra1 = new Compra();

        compra1.itens.add(item1);
        compra1.itens.add(item2);
        compra1.itens.add(item3);
        compra1.itens.add(item4);
        compra1.itens.add(item2);

        compra1.novoCliente(cliente1);

        System.out.printf("No tatal as compras do cliente %s ficou R$%f", cliente1.nome, cliente1.obterValorTotalCompras());

    }
}

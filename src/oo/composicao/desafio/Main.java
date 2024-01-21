package oo.composicao.desafio;

//Desafio proposto para colocar em pratica meus conhecimentos de composição

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lucas");

        Compra compra1 = new Compra();
        compra1.adcionarNovoItem(new Produto("Arroz", 22.99), 1);
        compra1.adcionarNovoItem(new Produto("Feijão", 19.99), 2);
        compra1.adcionarNovoItem(new Produto("Leite", 5.99), 9);
        compra1.adcionarNovoItem(new Produto("Ovo", 1.50), 30);

        Compra compra2 = new Compra();
        compra2.adcionarNovoItem("Miojo", 5.99, 3);
        compra2.adcionarNovoItem("Pipoca", 10.67, 4);

        cliente1.adcionarCompra(compra1);
        cliente1.adcionarCompra(compra2);


        System.out.printf("No tatal as compras do cliente %s ficou R$%.2f", cliente1.nome, cliente1.obterValorTotalCompras());
    }
}

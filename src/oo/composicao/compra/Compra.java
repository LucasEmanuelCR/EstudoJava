package oo.composicao.compra;

import java.util.ArrayList;

public class Compra {

    String nomeCliente; // Atributo nomeCliente para representar o cliente que está realizando a compra.
    ArrayList<Item> itens = new ArrayList<>(); // Atributo itens que represeta a lista de itens adicionados nessa compra.

    // Método que busca na lista itens os preços de cada item, realiza a soma e retorna o valor total.
    final double obterValorTotal(){
        double total = 0;
        for (Item item: this.itens){
            total += item.prco;
        }
        return total;
    }

    // Metodo onde imprimi o nome do cliente, os atributos de cada item adicionados na compra e o valor total dessa compra
    void mostrarCompra(){
        System.out.println("Cliente: " + this.nomeCliente);
        for(Item item: itens){
            System.out.printf("\nProduto: %S\n  Quantidade: %d\n  Valor: %.2f;", item.nome, item.qunt, item.prco);
        }
        System.out.println("\n\nValor total: R$" + obterValorTotal());
    }

}

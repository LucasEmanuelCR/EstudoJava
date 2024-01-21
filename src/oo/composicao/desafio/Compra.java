package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    //Atributos 'cliente' e 'itens' para represtar uma compra
    Cliente cliente;
    final ArrayList<Item> itens = new ArrayList<>();

    // Método onde recebe uma String, double e int e instancia um novo Produto e adiciona esse produto na lista de itens da compra.
    void adcionarNovoItem(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }
    // Método onde recebe um 'produto' e uma 'quantidade' e instancia um novo item na lista de itens da compra
    void adcionarNovoItem(Produto produto, int quantidade){
        this.itens.add(new Item(produto, quantidade));
    }

    // Método que obtem o valor total dos itens da intancia atual da compra
    double obterValorTotalCompra(){
        double total =0;
        for(Item item: itens){
            double valor = item.produto.preco * item.quantidade;
            total += valor;
        }
        return total;
    }

}

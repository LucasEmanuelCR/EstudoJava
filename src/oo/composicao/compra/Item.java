package oo.composicao.compra;

public class Item {

    // Atibutos nome, quantidade e preco para representar os atributos de um item
    String nome;
    int qunt;
    double prco;

    // Construtor onde receber o nome, quantidade e preco e atribui aos atributos dessa classe
    Item (String nome, int qunt, double prco){
        this.nome = nome;
        this.qunt = qunt;
        this.prco = prco;
    }

}

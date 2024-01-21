package oo.composicao.desafio;

public class Item {
    //Atributos 'quantidade' e 'produto' para representar as caracteristicas de um item
    final int quantidade;
    final Produto produto;

    // Construtor onde recebe os valores dos atributos 'quantidade' e 'produto'
    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

}

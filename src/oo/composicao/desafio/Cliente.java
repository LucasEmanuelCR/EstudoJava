package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    double obterValorTotalCompras(){
        double total = 0;
        for(Compra compra: compras){
            for(Item item: compra.itens){
                double valor = item.produto.preco * item.quantidade;
                total += valor;
            }
        }
        return total;
    }

}

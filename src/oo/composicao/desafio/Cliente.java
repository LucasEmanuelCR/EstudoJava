package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    //Atributos 'nome' e 'compras' que representam um Cliente.
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    //Construtor onde recebe uma String e atribui ao atributo 'nome'.
    Cliente(String nome){
        this.nome = nome;
    }
    //Método onde soma os valores totais de todas as compras vinculadas a esse cliente
    double obterValorTotalCompras(){
        double total = 0;
        for(Compra compra: compras){
            total += compra.obterValorTotalCompra();
        }
        return total;
    }

    // Método onde vincula a 'compra' ao 'cliente' e o 'cliente' a 'compra'
    void adcionarCompra(Compra compra){
        this.compras.add(compra);
        compra.cliente = this;
    }

}

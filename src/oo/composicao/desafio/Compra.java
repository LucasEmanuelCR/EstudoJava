package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    Cliente cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void novoCliente(Cliente nome){
        this.cliente = nome;
        nome.compras.add(this);
    }

}

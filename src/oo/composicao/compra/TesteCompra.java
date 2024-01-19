package oo.composicao.compra;

public class TesteCompra {
    public static void main(String[] args) {
        Compra compra = new Compra(); // Crio um objeto do tipo compra para representar minha compra.

        // Atribuo valores ao atributos da classe compra.
        compra.nomeCliente = "Lucas";
        compra.itens.add(new Item("Caneta", 2, 0.50));
        compra.itens.add(new Item("Lápis", 1, 0.30));
        compra.itens.add(new Item("Lápis de cor", 1, 15.90));
        compra.itens.add(new Item("Caderno dez matérias", 1, 45.99));

        // Metodo chamado para imprimir a compra.
        compra.mostrarCompra();
    }

}

package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.printf("Carro está ligado? %b", carro.verificaCarroLigado());
    }
}

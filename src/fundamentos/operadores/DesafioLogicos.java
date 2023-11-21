package fundamentos.operadores;
/*
Trabalho de terça-feira
Trabalho de Quarta-feira
Se os dois trabalhos forem realizados, comprarei uma tv de 50 polegadas
Se apenas um trabalho for realizado, comprarei uma tv de 32 polegadas
Se uma teve for comprada, tomaremos servete
Se nenhum serviço der certo, não iremos tomar servete
 */
public class DesafioLogicos {
    public static void main(String[] args) {

        Boolean trabalhoTerca = false;
        Boolean trabalhoQuarta = true;

        Boolean comprarTv50 = trabalhoTerca && trabalhoQuarta;
        Boolean comprarTv32 = trabalhoTerca ^ trabalhoQuarta;
        Boolean tomarSorvete = trabalhoTerca || trabalhoQuarta;
        Boolean ficaremosEmCasa = !(trabalhoTerca || trabalhoQuarta);

        System.out.printf("Compraremos a TV de 50p: %b%n", comprarTv50);
        System.out.printf("Compraremos a TV de 32p: %b\n", comprarTv32);
        System.out.printf("Tomaremos sorvete: %b%n", tomarSorvete);
        System.out.printf("Ficaremos em casa: %b%n", ficaremosEmCasa);

    }
}

package arrays.EqualHeshcode;

public class Equal {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Lucas", "lucasemanuel@gmail.com");
        Usuario usuario2 = new Usuario("Lucas", "lucasemanuel@gmail.com");

        System.out.printf("Igualdade com 'equals': %b", usuario1.equals(usuario2));
        System.out.printf("\nIgualdade com '==': %b", usuario1 == usuario2);

    }
}
/* Anotações:
-> Quando você cria um objeto em Java, está criando uma referência a um endereço na memória onde o objeto é armazenado.
-> Em um objeto, por padrão, já possui um método ".equals", o qual, se não for sobrescrito, terá o
mesmo funcionamento do operador '==', comparando assim o endereço de memória e não o conteúdo armazenado.
-> O método ".equals" vem junto com o método "hashCode". Utilizando os dois como um conjunto é possível realizar uma busca mais eficiente.
-> O método ".equals" retorna um valor booleano, e o método percorre comparando todos os valores.
-> O método "hashCode" retorna um valor inteiro, e o método traz somente os objetos que possuem o mesmo hashCode.
*/


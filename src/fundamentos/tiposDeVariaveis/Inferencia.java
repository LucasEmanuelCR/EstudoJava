package fundamentos.tiposDeVariaveis;

public class Inferencia {
    public static void main(String[] args) {

        var idade = 19;

        System.out.println("O lucas tem " + idade + " anos");

    }
}
/*Anotações:
   - Uma variável criada como 'var', ao receber um determinado valor, terá o tipo desse valor atribuído à variável.
   - O tipo sendo atribuido utilizando o 'var', a variavel não podera receber um valor de outro tipo.
   - Quando uma variável é declarada como 'var', ela deve ser inicializada na mesma sentença de código.
 */
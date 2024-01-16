package fundamentos.tiposDeVariaveis;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informções do funcionário

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontoAcumulados = 3_134_845_223l;

        float salario = 11_445.44f;
        double vendasAcumuladas = 2_991_747_103.01;

        boolean estaDeFerias = false; // true

        char status = 'A';

        System.out.println("Dias de empresa: " + (anosDeEmpresa * 385));
        System.out.println("O funcionário já realizou " + (numeroDeVoos / 2)+ " viagens");
        System.out.println("O funcionário acumulou " + (pontoAcumulados / vendasAcumuladas) + " pontos por real");
        System.out.println("O ID " + id + " ganha: R$" + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }

}

/*Anotações:
   - Java possui oito tipos primitivos.
   - Tipos inteiros: byte (1B), short (2B), int (4B) e long (8B).
   - Tipos flutuantes: float (4B) e double (8B).
   - Tipo caractere: char.
   - Tipo verdadeiro/falso: boolean.

   - Valor literal é um valor colocado diretamente no código.
   - Valor literal inteiro é do tipo int.
   - Valor literal flutuante é do tipo double.
   - Ao atribuir um valor a uma variável de tipo diferente, deve-se considerar a capacidade do tipo.
   - Para atribuir um valor literal inteiro a uma variável do tipo long, é necessário adicionar 'L' ou 'l' ao final do valor.
   - Para atribuir um valor literal flutuante a uma variável do tipo float, é necessário adicionar 'F' ou 'f' ao final do valor.
 */
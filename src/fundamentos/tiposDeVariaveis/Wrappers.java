package fundamentos.tiposDeVariaveis;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Scanner digite = new Scanner(System.in);

        System.out.println("Responda as perguntas para realizar o cadastro");

        System.out.print("Nome: ");
        String nome = digite.nextLine();
        System.out.print("Idade: ");
        Byte idade = digite.nextByte();
        System.out.print("Ano de nascimento: ");
        Integer anoNascimento = digite.nextInt();
        System.out.print("Número de familiares: ");
        Short numeroFamiliares = digite.nextShort();
        System.out.print("CPF: ");
        Long cpf = digite.nextLong();

        System.out.print("Grupo sanguino: ");
        Character grupoSanguino = digite.next().charAt(0);
        System.out.print("Rh sanguino: ");
        Character rhSanguino = digite.next().charAt(0);

        System.out.print("Pretensão salarial: ");
        Double pretensaoSalarial = digite.nextDouble();
        System.out.print("Último salário: ");
        Float ultimoSalario = digite.nextFloat();

        System.out.print("Está empregado? (True/False)");
        Boolean estaEmpregado = digite.nextBoolean();

        System.out.println("----------Informações cadastradas-----------");
        System.out.printf("Nome: %s", nome);
        System.out.printf("\nIdade: %d", idade);
        System.out.printf("\nAno de nascimento: %s", anoNascimento);
        System.out.printf("\nNúmero de familiares: %s", numeroFamiliares);
        System.out.printf("\nCPF: %s", cpf);
        System.out.printf("\nTipo sanguino: %s", grupoSanguino.toString()
                .toUpperCase().concat(rhSanguino.toString()));
        System.out.printf("\nPretensão salarial: %.2f", pretensaoSalarial);
        System.out.printf("\nÚltimo salário: %.2f", ultimoSalario);
        System.out.printf("\nEstá empregado: %b", estaEmpregado);
        System.out.println("\n--------------------------------------------");

        digite.close();
    }
}
/*Anotações
    - Tudo no java é objetos, menos os tipos primitivos.
    - Wrappers são a versão objeto dos tipos primitivos.
    -Tipos Warapper:
        Inteiros: Byte, Short, Integer e Long;
        Flutuante: Float e Double
        Charactere: Character
        Verdade/Falso: Boolean
 */
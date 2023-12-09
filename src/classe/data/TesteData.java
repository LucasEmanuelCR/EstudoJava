package classe.data;
// Este programa demonstra o uso da classe Data para representar datas de nascimento e calcular a idade com base no ano atual.
public class TesteData {
    public static void main(String[] args) {

        final int anoAtual = 2023;

        // Instanciando um objeto do tipo Data utilizando o construtor padrão
        Data data1 = new Data();

        // Calculando a idade com base no ano de nascimento informado
        int idade = anoAtual - data1.ano;

        // Apresentando ao usuário as informações da primeira data de nascimento e idade
        System.out.printf("Data de nacimento: %s", data1.obterDataFormatada());
        System.out.printf("\nO usuário possui %d anos", idade);

        // Instanciando um segundo objeto do tipo Data e atribuindo valores aos atributos para representar outra data de nascimento
        Data data2 = new Data(11, 8, 2005);

        // Calculando a idade com base no ano de nascimento informado
        int idade2 = anoAtual - data2.ano;

        // Apresentando ao usuário as informações da segunda data de nascimento e idade
        System.out.printf("\nData de nacimento: %s", data2.obterDataFormatada());
        System.out.printf("\nO usuário possui %d anos", idade2);

    }
}

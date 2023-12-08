package classe.data;
// Este programa demonstra o uso da classe Data para representar datas de nascimento e calcular a idade com base no ano atual.
public class TesteData {
    public static void main(String[] args) {

        final int anoAtual = 2023;

        // Instanciando um objeto do tipo Data e atribuindo valores aos atributos para representar a data de nascimento
        Data data1 = new Data();
        data1.dia = 10;
        data1.mes = 05;
        data1.ano = 2004;

        // Calculando a idade com base no ano de nascimento informado
        int idade = anoAtual - data1.ano;

        // Apresentando ao usuário as informações da primeira data de nascimento e idade
        System.out.printf("Data de nacimento: %s", data1.obterDataFormatada());
        System.out.printf("\nO usuário possui %d anos", idade);

        // Instanciando um segundo objeto do tipo Data e atribuindo valores aos atributos para representar outra data de nascimento
        Data data2 = new Data();

        data2.dia = 11;
        data2.mes = 8;
        data2.ano = 2005;

        // Calculando a idade com base no ano de nascimento informado
        int idade2 = anoAtual - data2.ano;

        // Apresentando ao usuário as informações da segunda data de nascimento e idade
        System.out.printf("\nData de nacimento: %s", data2.obterDataFormatada());
        System.out.printf("\nO usuário possui %d anos", idade2);

    }
}

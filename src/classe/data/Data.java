package classe.data;
//  O desafio é completar a implementação da classe Data e do método main para criar instâncias da classe, atribuir valores e calcular idades.
public class Data {
    // Representa uma data, com atributos para dia, mês e ano
    int dia;
    int mes;
    int ano;

    // Crio um método onde concatenará o dia o mês e o ano, e retornará a data formatada
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano
        );
    }
}

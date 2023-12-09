package classe.data;
//  O desafio é completar a implementação da classe Data e do método main para criar instâncias da classe, atribuir valores e calcular idades.
public class Data {
    // Representa uma data, com atributos para dia, mês e ano
    int dia;
    int mes;
    int ano;

    // Crio um construtor padrão que ao ser utilizado ira atribuir um dia, mes e ano padrão
    Data (){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    //Crio um construtor que receberá um dia, mes e ano
    Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Crio um método onde concatenará o dia o mês e o ano, e retornará a data formatada
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano
        );
    }
}

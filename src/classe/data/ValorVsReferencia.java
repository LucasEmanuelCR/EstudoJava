package classe.data;

public class ValorVsReferencia {
    public static void main(String[] args) {

        // Realizo uma atribuição por valor
        int a = 1;
        int b = a;

        System.out.println(b);
        System.out.println(a);

        // Paço o valor da variável como parametro para um método
        alterarValor(a);
        alterarValor(b);

        System.out.println(b);
        System.out.println(a);


        // Realizo uma atribuição de referência
        Data data1 = new Data(1, 2, 2001);
        Data data2 = data1;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        // Informo a referencia de um obejto como parametro no método
        alteraValorParaPadrão(data1);

        System.out.println(data2.obterDataFormatada());



    }
    // Metodo onde realiza o incremento
    static void alterarValor(int c){
        c++;
    }

    static void alteraValorParaPadrão(Data a){
        a.dia = 1;
        a.mes = 1;
        a.ano = 1970;
    }

}

/*-> Quando uma variável primitiva é atribuída a outra variável primitiva, é criada uma cópia. Isso é atribuição por valor.
-> Quando uma variável primitiva é usada como parâmetro em um método, o que está sendo passado é o valor da variável.
-> Quando um objeto é atribuído a outro objeto, o que é atribuído é o endereço na memória. Isso é atribuição por referência.
-> Quando um objeto é passado como parâmetro em um método, o que está sendo passado é o endereço de memória e não os valores do objeto.
-> Quando um objeto não pode mais ser alcançado, o Garbage Collector do Java exclui o objeto da memória para liberar espaço.*/

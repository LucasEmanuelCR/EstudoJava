package classe.AreaCirc;

public class AreaCirc {
    // Crio atributo raio que pertence ao objeto e o atributo PI que pertence a classe
    double raio;
    static final double PI = 3.1415;

    // Crio um construtor que recebe o valor do raio em seus parâmetro
    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    //Crio um método para calcular a area que pertence a classe
    static double calculaArea (double raio){
        return PI * (Math.pow(raio, 2));
    }
}
/*
 -   Membros de instância consistem nos valores específicos de cada instância.

 -   Os membros de uma classe são valores que estão associados à classe e são compartilhados por todas as instâncias.

 -  Para indicar ao Java que um membro pertence à classe, utiliza-se a palavra-chave 'static'

 -   Quando o membro pertence ao objeto, só teremos acesso a esse membro quando instanciarmos um objeto.

 -   Quando o membro pertence à classe, temos acesso ao membro pela classe.
*/
package classe.produto;

// Crio uma classe chamada Produto, com os atributos de objeto nome e valor e o atributo de classe desconto.
public class Produto {
    String nome;
    double valor;
    static double desconto = 0.25;

    // Crio um construtor onde recebe o nome e o valor do objeto em seus parametros
    Produto(String nomeIncicial, double precoInicial){
        nome = nomeIncicial;
        valor = precoInicial;
    }

    //Crio um método que receberá o valor do produto e seu respectivo desconto, e retornará o valor menos o desconto.
    double precoComDesconto(){
        return valor * (1 - desconto);
    }
}

/*Anotações das aulas teóricas 88 até a aula 93:
    -> Uma classe em Java é declarada com o mesmo nome do arquivo onde ela está contida.
    -> A anatomia de uma classe é definida da seguinte forma:
    class NomeDaClasse { Corpo da classe }
    -> No corpo de uma classe estão seus membros, que consistem em atributos/dados e comportamentos/métodos.
    -> Uma classe em Java é um tipo personalizado de dados que representa uma abstração da vida real.
    -> Além disso, uma classe pode ser vista como uma estrutura de dados que define o comportamento e os atributos de um objeto.
    -> Um objeto, ou instância, é um dado criado por uma classe.
    -> Membros de uma classe incluem: variáveis, constantes, construtores, métodos e classes internas.
    -> Existem variáveis, constantes, classes e objetos que pertencem à classe, assim como existem aqueles que pertencem
    a uma instância específica da classe (ou seja, a um objeto).
    -> Para acessar um membro da classe ou um membro do objeto, utiliza-se o operador ponto (.), também conhecido como notação ponto.
*/
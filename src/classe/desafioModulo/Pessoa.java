package classe.desafioModulo;
// Crio uma classe pessoa com os atributos nome peso para representar uma pessoa
public class Pessoa {

    String nome;
    double peso;

    // Crio um método 'comer' que irá receber um objeto do tipo 'comida' e irá incrementar o peso do 'comida' no peso da 'pessoa'.
    void comerComida(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }
}

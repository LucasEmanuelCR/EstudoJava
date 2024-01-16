package classe.AreaCirc;

public class TesteAreaCirc {
    public static void main(String[] args) {
        // Instanciando um objeto do tipo AreaCirc
        AreaCirc a1 = new AreaCirc(10);

        System.out.println(AreaCirc.calculaArea(a1.raio));

        System.out.println(AreaCirc.calculaArea(10));

    }
}

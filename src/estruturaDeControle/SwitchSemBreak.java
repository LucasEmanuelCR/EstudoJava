package estruturaDeControle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "aMARElo";

        switch (faixa.toUpperCase()) {
            case ("PRETA"): {
                System.out.println("Eu sei Bassai-Dei");
            }
            case ("MARROM"): {
                System.out.println("Eu sei Tekki Shodan");
            }
            case ("ROXA"): {
                System.out.println("Eu sei Haian Godan");
            }
            case ("VERDE"): {
                System.out.println("Eu sei Heian Yodan");
            }
            case ("LARANJA"): {
                System.out.println("Eu sei Heian Sandan");
            }
            case ("VERMELHO"): {
                System.out.println("Eu sei Heian Nidan");
            }
            case ("AMARELO"): {
                System.out.println("Eu sei Heia Shodan");
            }
        }
    }
}

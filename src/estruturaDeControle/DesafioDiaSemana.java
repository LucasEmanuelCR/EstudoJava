package estruturaDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Me informe um dia da semana: ");
        String diaSemana = entry.nextLine().toUpperCase();

        if(diaSemana.equals("DOMINGO")){
            System.out.print("Domingo -> 1");
        } else if (diaSemana.equals("SEGUNDA")) {
            System.out.print("Segunda -> 2");
        } else if (diaSemana.equals("TERÇA") || diaSemana.equals("TERCA") ) {
            System.out.print("Terça -> 3");
        } else if (diaSemana.equals("QUARTA")) {
            System.out.print("Quarta -> 4");
        }else if (diaSemana.equals("QUINTA")){
            System.out.print("Quinta -> 5");
        } else if (diaSemana.equals("SEXTA")) {
            System.out.print("Sexta -> 6");
        } else if (diaSemana.equals("SÁBADO") || diaSemana.equals("SABADO")) {
            System.out.print("Sábado -> 7");
        }else {
            System.out.print("Dia da semana invalido");
        }

        entry.close();
    }
}

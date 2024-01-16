package arraysCollections.arrays;

import java.util.Scanner;

public class ExercicioForeach {
    public static void main(String[] args) {

        double[] notasAluno = new double[3];

        Scanner digite = new Scanner(System.in);

        for(int i = 0; i < notasAluno.length; i++ ){
            System.out.print("Digiete: ");
            notasAluno[i] = digite.nextDouble();
        }

        System.out.print("As notas digitadas foram: ");
        for(double nota: notasAluno){
            System.out.printf("[ %.2f ]", nota);
        }

    }
}
/*Anotações:
    -> foreach é o nome de um método para percorrer uma Array
 */

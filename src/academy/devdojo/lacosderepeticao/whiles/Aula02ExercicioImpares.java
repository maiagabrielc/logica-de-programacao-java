package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        int userNumber = keyboard.nextInt();
        int counter = 1;
        while (counter <= userNumber) {
            if (counter % 2 != 0) {
                System.out.printf("%n%d", counter);
            }
            counter += 1;
        }
    }
}

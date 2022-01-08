package academy.listadeexercicios.topicodois;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Digite 5 números inteiros: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }
        int greatestNumber = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if (greatestNumber < numbers[index]) {
                greatestNumber = numbers[index];
            }
        }
        System.out.println("O maior número é: " + greatestNumber);
    }
}

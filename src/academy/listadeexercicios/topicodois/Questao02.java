package academy.listadeexercicios.topicodois;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 >= num2) {
            if(num2 >= num3) {
                System.out.printf("Em ordem %d %d %d", num3, num2, num1);
            } else if(num3 >= num1) {
                System.out.printf("Em ordem %d %d %d", num2, num1, num3);
            } else {
                System.out.printf("Em ordem %d %d %d", num2, num3, num1);
            }
        } else {
            if(num3 >= num2) {
                System.out.printf("Em ordem %d %d %d", num1, num2, num3);
            }else if(num3 >= num1) {
                System.out.printf("Em ordem %d %d %d", num1, num3, num2);
            } else {
                System.out.printf("Em ordem %d %d %d", num3, num1, num2);
            }
        }
    }
}

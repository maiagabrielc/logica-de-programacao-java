package academy.listadeexercicios.topicoum;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PI = 3.141592654;

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = PI * (raio * raio);

        System.out.printf("A área de um círculo com o raio = %.2f%n", raio);
        System.out.printf("%.2f%n", area);
    }
}

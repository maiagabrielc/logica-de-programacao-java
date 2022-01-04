package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03Arrays {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        double media = 0;

        for (int i = 0; i < notas.length; i += 1) {
            System.out.printf("Digite a nota %d: %n", (i + 1));
            notas[i] = scanner.nextDouble();
            media += notas[i];
        }
        media /= notas.length;
        for (int i = 0; i < notas.length; i += 1) {
            System.out.printf("Nota %d: %.2f%n", (i + 1), notas[i]);
        }
        System.out.printf("A média das notas é: %.2f", media);
    }
}

package academy.listadeexercicios.topicoquatro;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        int[] vetor1 = new int[9];
        int[] vetor2 = new int[9];
        int[] vetorResultadoMultiplicacao = new int[9];
        Scanner scanner = new Scanner(System.in);

        String resultado = "";

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o valor do Vetor 1: ");
            vetor1[i] = scanner.nextInt();
            System.out.println("Digite o valor do Vetor 2: ");
            vetor2[i] = scanner.nextInt();

            vetorResultadoMultiplicacao[i] = vetor1[i] * vetor2[i];
            resultado += vetorResultadoMultiplicacao[i] + " ";
        }

        System.out.println();
        System.out.println(resultado);
    }
}

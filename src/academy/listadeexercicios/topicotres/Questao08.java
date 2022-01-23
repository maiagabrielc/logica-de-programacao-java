package academy.listadeexercicios.topicotres;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você gostaria de ver a tabuada");
        int numeroUsuario = scanner.nextInt();
        int limiteTabuada = 1;
        while (limiteTabuada < 11) {
            int resultado = limiteTabuada * numeroUsuario;
            System.out.printf("%d x %d = %d%n", numeroUsuario, limiteTabuada, resultado);
            limiteTabuada += 1;
        }
    }
}

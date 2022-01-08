package academy.listadeexercicios.topicodois;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        System.out.println("(O resultado será exibido se for satisfeita uma determinada condição)");
        int numeroQualquer = scanner.nextInt();
        int resultoMultiplicado = numeroQualquer * 2;
        if (resultoMultiplicado >= 30) {
            System.out.println(resultoMultiplicado);
        }
    }
}

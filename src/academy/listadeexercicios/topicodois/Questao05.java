package academy.listadeexercicios.topicodois;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numDeEscala = scanner.nextInt();

        if(numDeEscala >= 1 && numDeEscala <= 9) {
            System.out.println("Dentro do valor permitido");
        } else {
            System.out.println("Fora do valor permitido");
        }
    }
}

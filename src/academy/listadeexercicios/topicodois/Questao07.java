package academy.listadeexercicios.topicodois;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite qual operação você deseja realizar:");
        System.out.println("/ * + -");
        String operacao = scanner.next();
        int resultado;

        switch (operacao) {
            case "/":
                resultado = primeiroNumero / segundoNumero;
                System.out.println(resultado);
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
                System.out.println(resultado);
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                System.out.println(resultado);
                break;
            case "+":
                resultado = primeiroNumero + segundoNumero;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Operação inválida!");

        }

    }
}

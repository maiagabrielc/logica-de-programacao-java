package academy.listadeexercicios.topicocinco;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o primeiro número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Digite a operação que deseja realizar:");
        System.out.println("Entre com + - * /");
        String operador = scanner.next();

        int resultado;

        switch (operador) {
            case "+":
                resultado = sum(primeiroNumero, segundoNumero);
                System.out.println(resultado);
                break;
            case "-":
                resultado = sub(primeiroNumero, segundoNumero);
                System.out.println(resultado);
                break;
            case "*":
                resultado = mult(primeiroNumero, segundoNumero);
                System.out.println(resultado);
                break;
            case "/":
                resultado = div(primeiroNumero, segundoNumero);
                System.out.println(resultado);
                break;
            default:
                System.out.println("Operador inválido!!");
        }


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}

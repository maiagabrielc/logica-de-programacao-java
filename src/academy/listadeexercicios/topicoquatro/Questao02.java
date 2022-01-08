package academy.listadeexercicios.topicoquatro;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] cpf = new int[11];
        int[] multiplicadorDigito1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] resultado = new int[11];
        int somatorio = 0;
        System.out.println("Digite os 9 dígitos do cpf a ser calculado: ");
        for (int digito = 0; digito < (cpf.length - 2); digito++) {
            cpf[digito] = scanner.nextInt();
            resultado[digito] = cpf[digito] * multiplicadorDigito1[digito];
            somatorio += resultado[digito];
        }
        somatorio = somatorio % 11;
        somatorio = cpf.length - somatorio;
        if (somatorio > 9) {
            cpf[cpf.length - 2] = 0;
        } else {
            cpf[cpf.length - 2] = somatorio;
        }

        int[] multiplicadorDigito2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        somatorio = 0;
        for (int digito = 0; digito < cpf.length - 1; digito++) {
            resultado[digito] = cpf[digito] * multiplicadorDigito2[digito];
            somatorio += resultado[digito];
        }

        somatorio = somatorio % 11;
        somatorio = cpf.length - somatorio;
        if (somatorio > 9) {
            cpf[cpf.length - 1] = 0;
        } else {
            cpf[cpf.length - 1] = somatorio;
        }

        for (int digito = 0; digito < cpf.length; digito++) {
            System.out.print(cpf[digito]);
        }
    }
}

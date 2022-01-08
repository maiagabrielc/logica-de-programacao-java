package academy.listadeexercicios.topicodois;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso em kilos: ");
        System.out.println("Por exemplo 65,89");
        double peso = scanner.nextDouble();
        System.out.println("Digite o altura em metros: ");
        System.out.println("Por exemplo 1,5");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 18.4) {
            System.out.println("Desnutrição");
        } else if(imc < 24.9) {
            System.out.println("Normal");
        } else if(imc < 29.9) {
            System.out.println("Pré-obesidade");
        } else {
            System.out.println("Obesidade");
        }
    }
}

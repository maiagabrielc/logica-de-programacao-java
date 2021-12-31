package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escolha a opção desejada: ");
        System.out.printf("%n1 - Calcular Imposto%n2 - Depositar Salário%n3 - Sair%n");
        int counter = 0;
        float tax = 0.13F;
        float salary = 1300.58F;
        float deposit = 0;
        while (counter != 3) {
            System.out.printf("O seu salário atual é de R$%.2f%n%n", salary);
            int choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    salary = salary - (salary * tax);
                    counter = 1;
                    break;
                case 2:
                    System.out.println("Digite quanto você gostaria de depositar: ");
                    deposit = keyboard.nextFloat();
                    salary = salary + deposit;
                    counter = 2;
                    break;
                case 3:
                    counter = 3;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            if (counter == 3) {
                System.out.println("Obrigado por usar nossos serviços!");
            } else if (counter == 2) {
                System.out.printf("%nO seu salário foi acrescido de %.2f%n", deposit);
                System.out.printf("%n1 - Calcular Imposto%n2 - Depositar Salário%n3 - Sair%n%n");
            } else {
                System.out.printf("Com a dedução do imposto de 13%% seu salário ficou R$%.2f", salary);
                System.out.printf("%n1 - Calcular Imposto%n2 - Depositar Salário%n3 - Sair%n%n");
            }
        }
    }
}

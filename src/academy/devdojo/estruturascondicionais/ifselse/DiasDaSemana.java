package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para saber o dia da semana: ");
        int numberUser = keyboard.nextInt();

        if (numberUser == 1) {
            System.out.println("Segunda-feira");
        } else if (numberUser == 2) {
            System.out.println("Terça-feira");
        } else if (numberUser == 3) {
            System.out.println("Quarta-feira");
        } else if (numberUser == 4) {
            System.out.println("Quinta-feira");
        } else if (numberUser == 5) {
            System.out.println("Sexta-feira");
        } else if (numberUser == 6) {
            System.out.println("Sábado");
        } else if (numberUser == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia inválido!");
        }
    }
}

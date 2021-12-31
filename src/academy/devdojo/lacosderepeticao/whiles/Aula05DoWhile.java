package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: Digite um número de 1 a 10");
            int num1 = keyboard.nextInt();
            System.out.println("PLAYER 2: Digite um número de 1 a 10");
            int num2 = keyboard.nextInt();
            if (num1 == num2) {
                System.out.println("Acertou " + true);
            } else {
                System.out.println("Foi " + false);
            }
            System.out.println("----------------------------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            desejaContinuar = keyboard.nextInt();
        } while (desejaContinuar == 1);
    }
}

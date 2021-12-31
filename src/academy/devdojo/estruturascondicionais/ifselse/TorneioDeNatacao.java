package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int age = teclado.nextInt();
        System.out.println("Digite o seu nome: ");
        String name = teclado.next();
        if(age <= 10) {
            System.out.printf("%s participará da categoria Infantil", name);
        } else if(age <= 15) {
            System.out.printf("%s participará da categoria Juvenil", name);
        } else if(age <= 19) {
            System.out.printf("%s participará da categoria Pré-adulto%n", name);
        } else {
            System.out.printf("%s participará da categoria Adulto%n", name);
        }
    }
}

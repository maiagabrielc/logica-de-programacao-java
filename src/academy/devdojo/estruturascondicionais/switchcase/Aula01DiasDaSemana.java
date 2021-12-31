package academy.devdojo.estruturascondicionais.switchcase;
import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para saber o dia da semana: ");
        int dia = keyboard.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabadão");
                break;
            case 7:
                System.out.println("Domingão");
                break;
            default:
                System.out.println("Número inválido!!");
                break;
        }
    }
}

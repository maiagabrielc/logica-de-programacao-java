import java.util.Scanner;

public class EntradaDeDadosTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = teclado.next(); // aceita strings
        System.out.println("Digite a sua idade: ");
        int age = teclado.nextInt(); // aceita apenas números inteiros
        System.out.printf("O nome digitado foi: %s%n", name);
        System.out.printf("A idade digitada foi: %d%n", age);
    }
}

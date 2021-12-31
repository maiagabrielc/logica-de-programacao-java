package academy.devdojo.estruturascondicionais.switchcase;
import java.util.Scanner;

public class Aula02GestaoDeConta {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o dígito para saber a porcentagem de juros da conta");
        System.out.println("1 - Conta Poupança, 2 - Conta Corrente, 3 - Conta Investimento");
        int digitoDaConta = keyboard.nextInt();
        String tipoDeConta = "";
        float porcentagemDaConta = 0;
        switch (digitoDaConta) {
            case 1:
                tipoDeConta = "Conta Poupança";
                porcentagemDaConta = 0.05F;
                break;
            case 2:
                tipoDeConta = "Conta Corrente";
                porcentagemDaConta = 0.02F;
                break;
            case 3:
                tipoDeConta = "Conta Investimento";
                porcentagemDaConta = 0.1F;
                break;
            default:
                System.out.println("Dígito inválido");
                break;
        }
        if (tipoDeConta.equals("")) {
            System.out.println("Nenhuma conta foi selecionada, tente novamente!");
        } else {
            System.out.printf("A %s possui juros de %.2f%% %n", tipoDeConta, porcentagemDaConta);
        }
    }
}

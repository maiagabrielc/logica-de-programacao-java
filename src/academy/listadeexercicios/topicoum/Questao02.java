package academy.listadeexercicios.topicoum;

public class Questao02 {
    public static void main(String[] args) {
        float horasTrabalhadas = 150F;
        float valorHorasTrabalhadas = 30F;
        float percentualDesconto = 0.35F;

        double salarioBase = horasTrabalhadas * valorHorasTrabalhadas;
        double totalDescontos = percentualDesconto * salarioBase;
        double salarioLiquido = salarioBase - totalDescontos;

        System.out.printf("Com salário base de: R$%.2f%n", salarioBase);
        System.out.printf("Possui um salário líquido de: R$%.2f%n", salarioLiquido);
    }
}

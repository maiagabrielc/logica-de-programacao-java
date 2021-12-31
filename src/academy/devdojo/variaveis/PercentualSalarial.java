package academy.devdojo.variaveis;

public class PercentualSalarial {
    public static void main(String [] args) {
        float salary = 1100.57F;
        // Java normalmente não está aceitando float, precisando fazer o typecasting para conseguir aceitar.
        float percentage = (float) 0.4;
        float salaryPercentage = salary * percentage;
        System.out.println("O valor percentual eh " + salaryPercentage);
    }
}

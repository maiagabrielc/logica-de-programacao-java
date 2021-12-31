package academy.devdojo.variaveis;

public class CalculadoraImposto {
    public static void main(String[] args) {
        float salary = 3500.57F;
        float percentage = 0.3F;
        float taxSalary = salary * percentage;

        System.out.println("O imposto de 30% em cima do salario eh " + taxSalary);
        percentage = 0.15F;
        taxSalary = salary * percentage;
        System.out.println("O imposto de 15% em cima do salario eh " + taxSalary);
        percentage = 0.05F;
        taxSalary = salary * percentage;
        System.out.println("O imposto de 5% em cima do salario eh " + taxSalary);
    }
}

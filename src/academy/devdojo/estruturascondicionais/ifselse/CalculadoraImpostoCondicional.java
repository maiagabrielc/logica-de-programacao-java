package academy.devdojo.estruturascondicionais.ifselse;

public class CalculadoraImpostoCondicional {
    public static void main(String[] args) {
        float salary = 4220.57F;
        float percentage, totalTax;
        String percent;
        if (salary > 4500) {
            percentage = 0.3F;
            percent = "30%";
            totalTax = salary * percentage;
        } else {
            percentage = 0.15F;
            totalTax = salary * percentage;
            percent = "15%";
        }
        System.out.printf("O valor final para %s é de %.2f.", percent, totalTax);
    }
}

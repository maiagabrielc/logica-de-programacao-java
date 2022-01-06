package academy.listadeexercicios.topicoum;

public class Questao04 {
    public static void main(String[] args) {
        float fahrenheit = 37.8F;
        float celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("A temperatura em celsius de %.1f é de: %n%.1f", fahrenheit, celsius);
    }
}

package academy.listadeexercicios.topicoum;

public class Questao05 {
    public static void main(String[] args) {
        double PI = 3.141592654;
        float raio = 13.4F;
        float altura = 2.5F;
        double volume = (PI * (raio * raio)) * altura;

        System.out.printf("O volume da lata de óleo é de %.2fcm³%n", volume);
    }
}

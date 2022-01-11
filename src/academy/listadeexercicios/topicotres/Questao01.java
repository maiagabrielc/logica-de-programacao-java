package academy.listadeexercicios.topicotres;

public class Questao01 {
    public static void main(String[] args) {
        int numeroBase;
        int numeroLimite = 200;
        for (numeroBase = 15; numeroBase <= numeroLimite; numeroBase++) {
            int resultado = numeroBase * numeroBase;
            System.out.printf("O quadrado de %d é %d%n", numeroBase, resultado);
        }
    }
}

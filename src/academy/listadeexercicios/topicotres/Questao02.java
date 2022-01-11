package academy.listadeexercicios.topicotres;

public class Questao02 {
    public static void main(String[] args) {
        int tabuada = 7;
        int limiteTabuada = 10;
        for (int multiplicador = 0; multiplicador <= limiteTabuada; multiplicador++) {
            int resultado = multiplicador * tabuada;
            System.out.printf("%d x %d = %d%n", tabuada, multiplicador, resultado);
        }
    }
}

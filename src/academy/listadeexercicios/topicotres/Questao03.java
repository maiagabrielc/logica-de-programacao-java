package academy.listadeexercicios.topicotres;

public class Questao03 {
    public static void main(String[] args) {
        int numeroBase = 1;
        int numeroLimite = 500;
        int resultado = 0;
        for (int contador = 1; contador < numeroLimite; contador++) {
            resultado += contador;
        }
        System.out.printf("O resultado do somatório de %d até %d é %d%n", numeroBase, numeroLimite, resultado);
    }
}

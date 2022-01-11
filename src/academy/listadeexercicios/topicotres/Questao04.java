package academy.listadeexercicios.topicotres;

public class Questao04 {
    public static void main(String[] args) {
        int numeroLimite = 100;
        for (int contador = 0; contador <= numeroLimite; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
    }
}

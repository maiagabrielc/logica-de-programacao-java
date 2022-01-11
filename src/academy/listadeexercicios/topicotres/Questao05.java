package academy.listadeexercicios.topicotres;

public class Questao05 {
    public static void main(String[] args) {
        int controle = 0;
        int limite = 15;
        int resultado;
        int primeiroNumero = 1;
        int segundoNumero = 0;
        System.out.println(controle);
        for (int contador = 0; contador < limite; contador++) {
            System.out.println(primeiroNumero);
            resultado = primeiroNumero + segundoNumero;
            segundoNumero = primeiroNumero;
            primeiroNumero = resultado;
        }
    }
}

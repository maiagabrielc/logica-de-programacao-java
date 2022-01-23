package academy.listadeexercicios.topicotres;

public class Questao06 {
    public static void main(String[] args) {
        int numeroFatorial = 5;
//        int resultado = fatorial(numeroFatorial);
        int controlador = numeroFatorial;

        while (numeroFatorial > 1) {
            controlador = controlador * (numeroFatorial - 1);
            numeroFatorial -= 1;
        }

        System.out.println(controlador);
//        System.out.println(resultado);
    }

//    public static int fatorial(int n) {
//        int controlador = n;
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            controlador = controlador * fatorial(n - 1);
//             return controlador;
//        }
//    }
}

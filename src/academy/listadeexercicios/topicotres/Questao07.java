package academy.listadeexercicios.topicotres;

public class Questao07 {
    public static void main(String[] args) {
        int numeroFatorial1 = 3;
        int numeroFatorial2 = 4;
        int numeroFatorial3 = 5;
        int numeroFatorial4 = 6;
        int numeroFatorial5 = 7;

        int controlador = numeroFatorial1;

        while (numeroFatorial1 > 1) {
            controlador = controlador * (numeroFatorial1 - 1);
            numeroFatorial1 -= 1;
        }
        System.out.println(controlador);

        controlador = numeroFatorial2;

        while (numeroFatorial2 > 1) {
            controlador = controlador * (numeroFatorial2 - 1);
            numeroFatorial2 -= 1;
        }
        System.out.println(controlador);

        controlador = numeroFatorial3;

        while (numeroFatorial3 > 1) {
            controlador = controlador * (numeroFatorial3 - 1);
            numeroFatorial3 -= 1;
        }
        System.out.println(controlador);

        controlador = numeroFatorial4;

        while (numeroFatorial4 > 1) {
            controlador = controlador * (numeroFatorial4 - 1);
            numeroFatorial4 -= 1;
        }
        System.out.println(controlador);

        controlador = numeroFatorial5;

        while (numeroFatorial5 > 1) {
            controlador = controlador * (numeroFatorial5 - 1);
            numeroFatorial5 -= 1;
        }
        System.out.println(controlador);

    }
}

package academy.listadeexercicios.topicodois;

public class Questao01 {
    public static void main(String[] args) {
        double[] notas = {15, 10, 9, 79};
        double media = 0;

        for (int index = 0; index < notas.length; index++) {
            media += notas[index];

            if (notas[index] == notas[notas.length - 1]) {
                media /= notas.length;
            }
        }

        if (media < 50) {
            System.out.println("Reprovado");
        } else if (media == 50) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
        System.out.println(media);
    }
}

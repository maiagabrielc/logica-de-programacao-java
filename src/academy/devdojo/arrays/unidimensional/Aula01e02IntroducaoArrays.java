package academy.devdojo.arrays.unidimensional;

public class Aula01e02IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.3;
        double nota3 = 3;
        double nota4 = 6.8;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
        System.out.println("------------------------------");
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.3;
        notas[2] = 3;
        notas[3] = 6.8;
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
    }
}

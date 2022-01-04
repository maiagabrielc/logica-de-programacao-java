package academy.devdojo.arrays.multidimensionais;

public class Aula01IntroducaoMultidimensional {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];
        int[][] arrayMulti2 = new int[2][3];

        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 55;
        arrayMulti[1][0] = 24;
        arrayMulti[1][1] = 69;

        System.out.print(arrayMulti[0][0] + " ");
        System.out.println(arrayMulti[0][1]);
        System.out.print(arrayMulti[1][0] + " ");
        System.out.println(arrayMulti[1][1]);

        arrayMulti2[0][0] = 22;
        arrayMulti2[0][1] = 55;
        arrayMulti2[0][2] = 559;
        arrayMulti2[1][0] = 24;
        arrayMulti2[1][1] = 69;
        arrayMulti2[1][2] = 678;

        System.out.print(arrayMulti2[0][0] + " ");
        System.out.print(arrayMulti2[0][1] + " ");
        System.out.println(arrayMulti2[0][2]);
        System.out.print(arrayMulti2[1][0] + " ");
        System.out.print(arrayMulti2[1][1] + " ");
        System.out.println(arrayMulti2[1][2]);
    }
}

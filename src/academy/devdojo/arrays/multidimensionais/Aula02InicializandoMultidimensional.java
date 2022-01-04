package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula02InicializandoMultidimensional {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];
        Scanner scanner = new Scanner(System.in);

        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 55;
        arrayMulti[1][0] = 24;
        arrayMulti[1][1] = 69;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "]" + "[" + j + "]" );
                arrayMulti[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "] = " + arrayMulti[i][j]);
            }
        }
    }
}

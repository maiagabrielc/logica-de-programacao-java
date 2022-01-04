package academy.devdojo.arrays.multidimensionais;

public class Aula03MatrizDiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 12;
        matriz[0][1] = 16;
        matriz[0][2] = 2;
        matriz[1][0] = 12;
        matriz[1][1] = 0;
        matriz[1][2] = 3;
        matriz[2][0] = 10;
        matriz[2][1] = 2;
        matriz[2][2] = 3;

        int principal = 1;
        int secundaria = 1;

        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (i == j) {
                    principal = principal * matriz[i][j];
                } else if( (i + j) == (matriz[i].length - 1)) {
                    secundaria = secundaria * matriz[i][j];
//                    System.out.println(secundaria);
                }
            }
            System.out.println();
        }
        System.out.println(principal);
//        System.out.println(secundaria);
    }
}

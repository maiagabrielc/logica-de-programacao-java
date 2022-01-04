package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula04ExercicioArrays {
    public static void main(String[] args) {
        int[] vet1 = new int[3];
        int[] vet2 = new int[3];
        int[] vetRes = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int contador = 0; contador < vet1.length; contador += 1) {
            System.out.println("Digite o valor para preencher do vetor 1");
            vet1[contador] = scanner.nextInt();
            System.out.println("Digite o valor a preencher do vetor 2: ");
            vet2[contador] = scanner.nextInt();
            vetRes[contador] = vet1[contador] * vet2[contador];
            if (vetRes[vetRes.length - 1] != 0) {
                for (contador = 0; contador < vetRes.length; contador += 1) {
                    System.out.println(vetRes[contador]);
                }
            }
        }

//        for (int contador = 0; contador < vet1.length; contador += 1) {
//            System.out.println(vetRes[contador]);
//        }
    }
}

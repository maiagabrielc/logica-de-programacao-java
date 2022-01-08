package academy.listadeexercicios.topicodois;

//import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int[] numerosDeBase = {3, 5, 15, 7, 2};

        for (int index = 0; index < numerosDeBase.length; index++) {
            if(numerosDeBase[index] % 2 == 0 || numerosDeBase[index] % 3 == 0) {
                System.out.println(numerosDeBase[index]);
            }
        }

    }
}

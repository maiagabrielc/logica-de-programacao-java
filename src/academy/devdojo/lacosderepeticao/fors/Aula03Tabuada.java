package academy.devdojo.lacosderepeticao.fors;

public class Aula03Tabuada {
    public static void main(String[] args) {
        int fixedNumber, counter;
        for (fixedNumber = 1; fixedNumber <= 10; fixedNumber += 1) {
            for (counter = 1; counter <= 10; counter += 1) {
                int result = fixedNumber * counter;
                System.out.printf("%d x %d = %d%n", fixedNumber, counter, result);
            }
            System.out.println();
        }
    }
}

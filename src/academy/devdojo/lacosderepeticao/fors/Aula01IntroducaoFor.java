package academy.devdojo.lacosderepeticao.fors;

public class Aula01IntroducaoFor {
    public static void main(String[] args) {
        int table = 3;
        for (int counter = 1; counter <= 10; counter += 1) {
            int result = table * counter;
            System.out.printf("%d x %d = %d%n", table, counter, result);
        }
    }
}

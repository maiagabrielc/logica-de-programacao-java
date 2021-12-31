package academy.devdojo.lacosderepeticao.fors;

public class QuadradoDeNumeros {
    public static void main(String[] args) {
        int counter;
        for (counter = 15; counter <= 200; counter +=1){
            int pow = counter * counter;
//            int pow = (int) Math.pow(counter, 2);
            System.out.println(pow);
        }
    }
}

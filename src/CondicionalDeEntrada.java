public class CondicionalDeEntrada {
    public static void main(String[] args) {
        int idade = 25;
        if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Jovem");
        } else {
            System.out.println("Criança");
        }
    }
}

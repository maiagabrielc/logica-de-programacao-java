package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeUsuario {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o nome de usuário a ser cadastrado: ");
        String login = keyboard.nextLine().toLowerCase();

        if(login.equals("") || login.equals("admin") || login.equals("administrador")) {
            System.out.println("Usuário inválido");
        } else {
            System.out.printf("%n%s cadastrado com sucesso", login);
        }
    }
}

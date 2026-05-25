import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite seu login: ");
        String login = Scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = Scanner.nextLine();

        if (login.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Login ou senha inválidos");
        }
    }
}
import java.util.Scanner;

public class vetores10 {
    public static void main(String[] args) {

        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8};

        Scanner scanner = new Scanner(System.in);

        int valor = 0;

        while (valor != -1) {
            System.out.print("Digite o valor para busca( -1 para sair): ");
            valor = scanner.nextInt();

            if (valor == -1) break;

            boolean achou = false;

            for (int i = 0; i < numero.length; i++) {
                if (numero[i] == valor) {
                    System.out.println("EXISTENTE");
                    System.out.println("Índice: " + i);
                    achou = true;
                }

                if (!achou) {
                    System.out.println("Número não encontrado.");
                }
            }
        }
    }
}
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextInt();

        int opcao;

        do {
            menu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: opcao1(numero1, numero2); break;
                case 2: opcao2(numero1, numero2); break;
                case 3: opcao3(numero1, numero2); break;
                case 4: opcao4(numero1, numero2); break;
                case 9: System.out.println("Saindo...."); break;
                default: System.out.println("Opção inválida...");
            }
        }while (opcao != 9);
        scanner.close();
    }

//Fazendo o menu

    public static void menu() {
        System.out.println("\n....I Suas opções I....");
        System.out.println("1- '+' ");
        System.out.println("2- '-' ");
        System.out.println("3- '*' ");
        System.out.println("4- '/' ");
        System.out.println("9- 'SAIR' ");

    }

//Fazendo as opções com retorno

    public static void opcao1(int numero1, int numero2) {
        System.out.println("\n----- ");
        System.out.println("Vc escolheu a opção 1 (SOMA)");
        System.out.println(somar(numero1, numero2));
        System.out.println("^ RESULTADO");

    }

    public static void opcao2(int numero1, int numero2) {
        System.out.println("\n----- ");
        System.out.println("Vc escolheu a opção 2 (SUBTRAÇÃO)");
        System.out.println(subtracao(numero1,numero2));
        System.out.println("^ RESULTADO");
    }

    public static void opcao3(int numero1, int numero2) {
        System.out.println("\n----- ");
        System.out.println("Vc escolheu a opção 3 (MULTIPLICAÇÃO)");
        System.out.println(multiplicacao(numero1, numero2));
        System.out.println("^ RESULTADO");
    }

    public static void opcao4(int numero1, int numero2) {
        System.out.println("\n----- ");
        System.out.println("Vc escolheu a opção 4 (DIVISÃO)");
        System.out.println(divide(numero1, numero2));
        System.out.println("^ RESULTADO");
    }

//Fazendo as operações

    public static int somar(int numero1, int numero2) { return numero1 + numero2; }

    public static int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int divide(int numero1, int numero2) {
        return numero1 / numero2;
    }

}

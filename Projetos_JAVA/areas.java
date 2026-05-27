import java.util.Scanner;
public class areas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    double raio;

                    System.out.println("Informe o valor do Raio: ");
                    raio = scanner.nextDouble();

                    opcao1circulo(raio);
                    break;

                case 2:
                    double lado;

                    System.out.println("Informe o valor do Lado: ");
                    lado = scanner.nextDouble();

                    opcao2quadrado(lado);
                    break;

                case 3:
                    double altura;
                    double base;

                    System.out.println("Informe o valor do Base: ");
                    base = scanner.nextDouble();

                    System.out.println("Informe o valor do Altura: ");
                    altura = scanner.nextDouble();

                    opcao3triangulo(base,altura);
                    break;

                case 9:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção inválida...");

            }
        }while (opcao != 9);
        scanner.close();

    }

//Fazendo o menu

    public static void menu () {
        System.out.println("\n.....I MENU I.....");
        System.out.println("SELECIONE A FIGURA QUE DESEJA CALCULAR A ÁREA! ");
        System.out.println("1- Círculo");
        System.out.println("2- Quadrado");
        System.out.println("3- Triangulo");
        System.out.println("9- SAIR");
    }

//Areas com retorno do cálculo

    public static void opcao1circulo(double raio) {
        System.out.println("\n----------------- ");
        System.out.println("Vc escolheu a opção 1 (CIRCULO)");
        System.out.printf("----I %.2f I----%n", multiplicacao(raio));
    }

    public static void opcao2quadrado(double lado) {
        System.out.println("\n----------------- ");
        System.out.println("Vc escolheu a opção 2 (QUADRADO)");
        System.out.println("----I  " + multiplicacao2(lado) + "  I----");
    }

    public static void opcao3triangulo(double base, double altura) {
        System.out.println("\n----------------- ");
        System.out.println("Vc escolheu a opção 3 (TRIANGULO)");
        System.out.println("----I  " + multiplicacao3(base,altura) + "  I----");
    }

//Fazendo as operações


    public static double multiplicacao(double raio) {
        return Math.PI * raio * raio;
    }

    public static double multiplicacao2(double lado) {
        return lado * lado;
    }

    public static double multiplicacao3(double base, double altura) {
        return base * altura /2 ;
    }

}
import java.util.Scanner;
public class vetores4 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int [6];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();

        }
        int maior = numeros[0];
        int menor = numeros[0];

        int indicemenor = 0;
        int indicemaior = 0;

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
                indicemaior = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                indicemenor = i;

            }
        }

        System.out.println("\n ---- Resultado ----");

        System.out.println("Maior elemento: " + maior);
        System.out.println("Maior índice: " + indicemaior);

        System.out.println("Menor elemento: " + menor);
        System.out.println("Menor índice: " + indicemenor);

        scanner.close();
    }
}
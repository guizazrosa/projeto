import java.util.Scanner;
public class vetores5 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        double[] numeros = new double[6];

        for (int i=0;i<numeros.length;i++) {

            System.out.println("Digite um numero: ");
            numeros[i]=scanner.nextDouble();

        }

        double menor = numeros[0];

        int menorindice = 0;

        for (int i=0;i<numeros.length;i++) {

            if (numeros[i] < menor) {
                menor = numeros[i];
                menorindice = i;

            }

        }

        System.out.println("\n ---- Resultado ----");
        System.out.println("Menor: " + menor);
        System.out.println("Menorindice: " + menorindice);

    }
}
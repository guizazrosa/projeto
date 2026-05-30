import java.util.Scanner;
public class vetores8 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite um numero: ");
                numeros[i] = scanner.nextInt();
            }

            int numerospares = 0;

            for (int elemento : numeros) {
                if (elemento != 0 && elemento %2 == 0){
                    numerospares++;
                }
            }

            System.out.println("numeros pares: " + numerospares);
    }
}

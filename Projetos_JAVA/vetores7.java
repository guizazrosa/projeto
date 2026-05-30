import java.util.Scanner;
public class vetores7 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int[] numeros = new int[5];

      for (int i = 0; i < numeros.length; i++) {

        System.out.println("Digite um numero: ");
        numeros[i] = scanner.nextInt();
      }

      int soma = 0;

      for (int elemento : numeros) {

        soma = soma + elemento;
      }

      int media = soma / numeros.length;

      int acimadamedia = 0;

      for(int i = 0; i < numeros.length; i++) {
        if (numeros[i] > media) {
          acimadamedia++;
        }
      }
      System.out.println("\nAcima da média: " + acimadamedia);
      System.out.println("Media: " + media);
    }
  }



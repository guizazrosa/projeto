public class vetores9 {
  public static void main(String[] args) {

    int numeros[] = {1,2,3,4,5};

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = numeros[i] * 2;
    }

    for (int elemento : numeros ) {
       System.out.println(elemento);

    }

  }
}
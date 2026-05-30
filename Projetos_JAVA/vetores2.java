public class vetores2 {
    public static void main(String[] args) {


        int[] numeros = new int[8];

        numeros[0] = 0;

        for (int i=0;i<numeros.length;i++) {

            numeros[i] = (i + 1) * 3;
        }

        System.out.println("elemenos do vetor: ");
        for (int i=0;i<numeros.length;i++) {
            System.out.println(numeros[i]);
        }
    }
}
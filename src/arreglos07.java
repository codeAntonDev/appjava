import java.util.Arrays;

public class arreglos07 {
    public static void main(String[] args) {
//        int[] numeros = new int[6];
//        System.out.println(Arrays.toString(numeros));
//
//        /*
//         Asiganando valor al elemento
//         */
//        int[] numCardinales = new int[5];
//        numCardinales[0] = 8;
//        numCardinales[4] = 3;
//        System.out.println(Arrays.toString(numCardinales));
//        System.out.println(numCardinales.length);

        /*
        Usando el Metodo deepToString
        */
        int[] numero_a = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(numero_a));

        int[][] matrices = {{0, 1}, {2, 3}};
        System.out.println(Arrays.deepToString(matrices));

        int[][] arrays_bi = new int[3][2];
        arrays_bi[1][0] = 1;
        System.out.println(Arrays.deepToString(arrays_bi));
    }
}

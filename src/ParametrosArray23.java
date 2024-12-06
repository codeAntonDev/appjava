public class ParametrosArray23 {
    public static void main(String[] args) {
        int r = suma(new int[] {10, 5, 10, 5, 10});
        System.out.println("La suma total del array es:" + r);
    }

    static int suma(int[] numeros) {
        int resultado = 0;
        for(int numero: numeros) {
            resultado += numero;
        }
        return resultado;
    }

}

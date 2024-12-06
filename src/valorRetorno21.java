public class valorRetorno21 {
    public static void main(String[] args) {
        int rSuma = suma(12, 25);
        int rResta = resta(52, 12);
        System.out.println("La suma es:" + rSuma + "\nLa resta es: " + rResta);
    }

    static int suma(int x, int y) {
        return x + y;
    }

    static int resta(int x, int y) {
        return x - y;
    }

}

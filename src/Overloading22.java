public class Overloading22 {
    public static void main(String[] args) {
        int rSuma1 = suma(25, 15);
        int rSuma2 = suma(17, 18, 99);
        System.out.println(rSuma1 + " \n" + rSuma2);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

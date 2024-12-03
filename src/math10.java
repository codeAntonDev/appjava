import java.util.concurrent.ThreadLocalRandom;

public class math10 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-15));

        System.out.println(Math.ceil(18.1));
        System.out.println(Math.floor(18.9));
        System.out.println(Math.round(18.4));

        System.out.println(Math.max(5, 2));
        System.out.println(Math.min(2, 10));

        double  a = Math.random();
        System.out.println((int) (a * 5));

        int numeroRandom = ThreadLocalRandom.current().nextInt(5);
        System.out.println(numeroRandom);
        int rangoEspecifico = ThreadLocalRandom.current().nextInt(10, 20);
        System.out.println(rangoEspecifico);
    }
}

public class Numero01 {
    public static void main(String[] args) {
        // Entre -128 a 127
        byte numero_a = -128;
        System.out.println("Numero_a: " + numero_a);
        System.out.println("Numero_a bytes: " + Byte.BYTES);
        System.out.println("Numero_a bits: " + Byte.SIZE);
        System.out.println("Numero_a Entre 0 a: " + Byte.MAX_VALUE);
        System.out.println("Numero_a Entre 0 a: " + Byte.MIN_VALUE);

        // Entre -32768 a 32767
        short numero_b = 32767;

        // Entre -2147483648 a 2147483647
        int numero_c = 2147483647;

        // Entre -9223372036854775808 a 9223372036854775807
        long numero_d = 9223372036854775807l;

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // Primitivo Char
        char a = 'a';
        System.out.println("Valor Char de a: " + a);
        char b = '9';
        System.out.println("Valor char de b: " + b);
        char c = '\u0040';
        System.out.println("Valor char de c: " + c);


        //Transformar numero a Binario
        int numeroDecimal = 900;
        System.out.println("El numero decimal es: " + numeroDecimal);
        System.out.println("El decimal convertido a Binario es: " + Integer.toBinaryString(numeroDecimal));
        System.out.println("El decimal convertido a Octal es: " + Integer.toOctalString(numeroDecimal));
        System.out.println("El decimal convertido a Hexadecimal es: " + Integer.toHexString(numeroDecimal));
    }
}

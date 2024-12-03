public class Flotantes02 {
    public static void main(String[] args) {
        float numeroFlotante = 5.984f;
        System.out.println(numeroFlotante);


        //Recorrer Exponentes
        float numero = 1.5e5F;
        System.out.println(numero);
        float numero_x = 1.5e-5f; //0.000015f;
        System.out.println(numero_x);
        System.out.println("Float en Bytes: " + Float.BYTES);
        System.out.println("Float en Bites: " + Float.SIZE);
        System.out.println("Float en Maximo Valor: " + Float.MAX_VALUE);
        System.out.println("Float en Minimo Valor: " + Float.MIN_VALUE);


        // Double
        double numeroDouble = 3.494894884949;
        System.out.println(numeroDouble);
        System.out.println(numero_x);
        System.out.println("Double en Bytes: " + Double.BYTES);
        System.out.println("Double en Bites: " + Double.SIZE);
        System.out.println("Double en Maximo Valor: " + Double.MAX_VALUE);
        System.out.println("Double en Minimo Valor: " + Double.MIN_VALUE);

        // Utlizando VAR
        var variableFlotante = 3.1416f;
        System.out.println("var: " + variableFlotante);

        var varFloating = 48;
        System.out.println(varFloating);
    }
}

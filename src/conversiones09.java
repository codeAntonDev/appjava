public class conversiones09 {
    public static void main(String[] args) {
//        byte valor_a = 7;
//        int valor_b = 23;
//        int valor_c = valor_a + valor_b;
//        System.out.println("valor_c = " + valor_c);
//
//        //Intentando sumar con un valor decimal
//        byte valor_x = 10;
//        double valor_y = 15.30;
//        double valor_z = valor_x + valor_y;
//        System.out.println("valor_z = " + valor_z);

        /*
        * CONVERSION EXPLICITA
        * */
//        int valor_a = 15;
//        float valor_b = 15.15f;
//        float resultado =  valor_a + (int) valor_b;
//        System.out.println("resultado = " + resultado);
        
        //Con String
        String valor_x = "5.5";
        double valor_y = 25.29;
        double valor_z = Double.parseDouble(valor_x)  + valor_y;
        System.out.println("valor_z = " + valor_z);

    }
}

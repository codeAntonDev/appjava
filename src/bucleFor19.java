public class bucleFor19 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + 1);
//        }
//
//        System.out.println("Saliendo del bucle FOR");

//        for (int x = 1, y = 10; x < y ; x++, y--) {
//            System.out.println(x + " - " + y);
//        }

        //CEREA UN PROGRAMA QUE IMPRIMA LOS NUMERO IMPARES ENTRE EL 1 al 20
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //FOR en arreglos
        String[] nombres = {"Jose","Carlos","Maria","Ana","Jefry"};
        int elementos = nombres.length;

        for (int i = 0; i < elementos; i++) {
            if (nombres[i].equalsIgnoreCase("Carlos") ||
                nombres[i].equalsIgnoreCase("Ana")) {
                continue;
            }

            System.out.println("Hola estimado(a): " + nombres[i]);
        }



    }
}

import java.util.Scanner;

public class operadorEntrada1_18 {
    public static void main(String[] args) {
        //CON STRINGS
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Inrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Tu nombre es: " + nombre + ", y tu apellido es: " + apellido);
*/

        //CON NUMEROS
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        String edad = scanner.nextLine();
        int convertEdad = Integer.parseInt(edad);

        System.out.println(convertEdad + convertEdad);*/

//        //CON NUMEROS DE OTRA FORMA
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingrese su edad: ");
//        int edad = scanner.nextInt();
//
//        System.out.println("la suma de su edad mas su edad es: " + (edad + edad));


        //CREA UN PROGRAMA QUE PIDA DOS NUMEROS Y QUE LE DEVULEVA LA OPERACION DE ELLOS
        //SUMA, RESTA, MULTIPLICACION y DIVISION.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numeroUno = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numeroDos = scanner.nextInt();

        System.out.println("la suma es: " + (numeroUno + numeroDos));
        System.out.println("la resta es: " + (numeroUno - numeroDos));
        System.out.println("la multiplicacion es: " + (numeroUno * numeroDos));

        //Solucionando division con decimal
//        float conversion = (float) numeroDos;

        //Solucion division por 0
        if (numeroDos != 0) {
            System.out.println("la division es: " + ((float) numeroUno / numeroDos));
        } else {
            System.out.println("La division es: No se puede dividir por 0");
        }

        scanner.close();

        //Usando Try catch
//        try {
//            if (numeroDos == 0) {
//                throw new ArithmeticException("Division por 0");
//            }
//            float resultado = (float) numeroUno / numeroDos;
//            System.out.println("la division es:" + resultado);
//        } catch (ArithmeticException e) {
//            System.out.println("La division es: No se puede dividir por 0");
//        }

    }
}

import Usuarios.Permiso;
import Usuarios.Usuarios;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios("Jose Perez");

        System.out.println(usuarios.getName());

        Permiso autorizacion = new Permiso();


        //String nombre = "Antonio";
        //System.out.println(nombre);
        //System.out.println("Hola Mundo");

        /*
         * ESTE
         * ES
         * UN COMENTARIO
         * DE MULTIPLES
         * LINEAS
         * */

        //int edad = 30;
        //int numeroTelefono = 978978878;
        //System.out.println(edad);
        //System.out.println(numeroTelefono);

//        double salario = 1050.98;
//        System.out.println(salario);
//
//
//        boolean casado = true;
//        System.out.println(casado);
//
//
//        char palabraClave = 'A';
//        System.out.println(palabraClave);
    }
}

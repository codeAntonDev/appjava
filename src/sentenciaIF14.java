public class sentenciaIF14 {
    public static void main(String[] args) {
        /*if (true) {
            System.out.println("Hola estudiantes \"INCEPERU\"");
        }*/
        int edad = -20;
//        int pelicula = 18;
        if (edad > 100) {
            System.out.println("Edad no verificada");
        } else if (edad > 17) {
            System.out.println("Puede ver la pelicula");
        } else if (edad > 10) {
            System.out.println("Necesita el permiso de los padres");
        } else if (edad < 0) {
            System.out.println("Edad erronea");
        } else {
            System.out.println("No puede ver la pelicula");
        }
    }
}

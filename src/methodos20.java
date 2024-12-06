public class methodos20 {
    public static void main(String[] args) {
        miSaludo("Juan", "Cardenas", 29);
        miSaludo("Pepita", "Martines", 51);
    }

    static void miSaludo(String nombre, String apellido, int edad) {
        System.out.println("Hola estimado(a): " + nombre + "\nSu apellido es: " + apellido);
        System.out.println("Su edad es: "+ edad);
    }
}

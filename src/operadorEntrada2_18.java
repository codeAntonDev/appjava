import javax.swing.*;

public class operadorEntrada2_18 {
    public static void main(String[] args) {
        // DATOS ENTRADA CON VENTANA Joption
//        Scanner scanner = new Scanner(System.in);
//        String nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre");
//        System.out.println("Su nombre es: " + nombre);

        //Con numero
//        String numero = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
//        int numeroEntero = Integer.parseInt(numero);
//        System.out.println("El numero es: " + (numeroEntero + numeroEntero));
//
//        String mensaje = "El numero es: " + numeroEntero;
//        JOptionPane.showMessageDialog(null, mensaje);

        //DINAMIC FORM
//        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre nombre: ");
//        String apellido = JOptionPane.showInputDialog(null,"Ingrese el apellido: ");
//
//        String mensaje = "Su nombre es: " + nombre;
//        mensaje += "\nEl apellido es: " + apellido;
//        JOptionPane.showMessageDialog(null, mensaje);

        //CREA UN PROGRAMA QUE PIDA DOS NUMERO Y LE MUESTRE SU SUMA SU RESTA SU MULTIPLICACION Y DIVISON
        //USANDO OE de VENTAN JOptionPane. mensaje
        String numero1 = JOptionPane.showInputDialog(null, "Ingresa el primer numero: ");
        String numero2 = JOptionPane.showInputDialog(null, "Ingresa el segundo numero: ");
        int numeroUno = Integer.parseInt(numero1);
        int numeroDos = Integer.parseInt(numero2);

        String mensaje = "La suma del numero " + numero1 + " y " + numero2 + " es: " + (numeroUno + numeroDos);
        mensaje += "\nLa resta del numero " + numero1 + " y " + numero2 + " es: " + (numeroUno - numeroDos);
        float conversionFloat = ((float) numeroUno / numeroDos);
        mensaje += "\nLa division del numero " + numero1 + " y " + numero2 + " es: " + String.format("%.2f", conversionFloat);


        //SECUENCIA DIVISION POR 0 IF
//        if (numeroDos != 0) {
//            mensaje += "\nLa division del numero " + numero1 + " y " + numero2 + " es: " + (numeroUno / numeroDos);
//        } else {
//            mensaje += "\nNo se puede dividir por 0";
//        }


        JOptionPane.showMessageDialog(null, mensaje);
    }
}

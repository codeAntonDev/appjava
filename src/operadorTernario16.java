public class operadorTernario16 {
    public static void main(String[] args) {
//        int edad = 10;
//        String msj = "Usted NO puede VOTAR";
//
//        if (edad >= 18) {
//            msj = "Usted puede VOTAR";
//        }

//        System.out.println(msj);

        //OPERADOR TERNARIO
//        int nota = 10;
//        String mensaje = nota >= 13 ? "Nota Aprobada" : "Nota Desaprobada";
//
//        System.out.println(mensaje);

        //COMBIERTE EL EJERCICIO DE LA EDAD PARA VER PELICULA EN OP TERNARIO
        int nota = -10;
        String notaFinal = (nota >= 16) ? "Nota Alta... Felicitaciones"
                : (nota >= 11) ? "Nota buena... Siga asi"
                : (nota < 0) ? "Nota Erronea"
                : "Nota Baja... Pongale mas empeño";
        System.out.println(notaFinal);
    }
}

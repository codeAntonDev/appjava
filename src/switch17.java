public class switch17 {
    public static void main(String[] args) {
//        String curso = "javascript";
//
//        switch (curso) {
//            case "java":
//                System.out.println("Elejiste el curso de Java");
//                break;
//            case "python":
//                System.out.println("Elejiste el curso de Python");
//                break;
//            default:
//                System.out.println("Proximamente el curso que mencionaste...");
//        }

        // SWITCH MODERNO
//        String curso = "JAVA";
//
//        String resultado = switch (curso.toLowerCase()) {
//            case "java" -> "Elejiste el curso de Java";
//            case "python" -> "Elejiste el curso de Python";
//            default -> "Pronto tendremos este curso";
//        };
//
//        System.out.println(resultado);

//        int dia = 2;
//
//        String diaLaborable = switch (dia) {
//            case 1, 2, 3, 4, 5 -> "Dia lavorables";
//            case 6 -> "Trabajo medio tiempo";
//            default -> "Descanso";
//        };
//
//        System.out.println(diaLaborable);
        int nota = 200;
        String notadecurso = switch (nota) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "Nota baja";
            case 11, 12, 13, 14, 15 -> "Nota aceptable";
            case 16, 17, 18, 19, 20 -> "Nota superlativa";
            default -> "Nota inválida";
        };
        System.out.println(notadecurso);

        //CON NUMEROS
//        int numero = 4;
//
//        switch (numero) {
//            case 1:
//                System.out.println("Soy el numero 1");
//                break;
//            case 2:
//                System.out.println("Soy el numero 2");
//                break;
//            case 3:
//            case 4:
//                System.out.println("Soy el numero 3 o 4");
//                break;
//            default:
//                System.out.println("Soy otro numero");
//        }


        // CREA UN PROGRAMA QUE IMPRIMA LAS NOTAS DE UN ALUMNO 0 - 10 Desaprovado, 11 - 16 buena y de 17 a 20 excelente


    }
}

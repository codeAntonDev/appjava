public class SecuenciaEscape05 {
    public static void main(String[] args) {
        String saludo = "\nHola\nMundo";
        System.out.println(saludo);

        String saludo2 = "Hola\bEstimados \rEstudiantes";
        System.out.println(saludo2);

        String saludo3 = "\tMi nombre \t\t\tes \t\tAntonio";
        System.out.println(saludo3);

        String saludo4 = "Mi nombre es /\"Antonio\"\\";
        System.out.println(saludo4);

    }
}

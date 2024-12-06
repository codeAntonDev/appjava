class MiClase {
    static String tableName = "nombre";
    String name;
    private int edad;

    MiClase (String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public int saludo() {
        System.out.println("Hola estimado(a) estudiante: " + this.name);
        System.out.println("\nSu edad es: " + this.edad);

        return this.edad;
    }

    private int metodoPrivado() {
        System.out.println("Recopilando datos");

        return  this.edad;
    }

}

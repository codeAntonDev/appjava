public class operadoresLogico13 {
    public static void main(String[] args) {
        //Operadores Logicos
        boolean x = true;
        boolean y = false;

        // OR
        System.out.println(x || y);

        // AND
        System.out.println(x && y);

        // NOT
        boolean not = !x;
        System.out.println(not);

        /*
        * CREA UN PROGRAMA QUE HAGA VALIDACION DE CORREO ELECTRONICO DE UN USUARIO
        * * Variables String
        * * Booleans ||  &&   !
        * */
        String usuario = "usarioPepito";
        String contrasenha = "clave2024";
        boolean usuarioValido = true;
        boolean contranhaValida = true;

        System.out.println("Los datos ingresados son correctos?: " + (usuarioValido && contranhaValida));
    }
}

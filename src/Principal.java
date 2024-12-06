public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jose@inceperu.edu.com", "jose123");

        System.out.println("Su correo es: " + usuario.correo);
        //Siempre que este en publico o default la propiedad contraseña:
        //System.out.println("Su correo es: " + usuario.contransenha);

        System.out.println("Su contraseña es: " + usuario.getContrasenha());

        usuario.setContrasenha("Jose2025");
        String joseNuevaContrasenha = usuario.getContrasenha();
        System.out.println("Su nueva contraseña es: " + joseNuevaContrasenha);



    }
}

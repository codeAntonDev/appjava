class Usuario {
    String correo;
    private String contrasenha;

    Usuario(String correo, String contrasenha) {
        this.correo = correo;
        this.contrasenha = contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    //A la propiedad correo ponerle de forma privada y hacer el cambio de valor.

}

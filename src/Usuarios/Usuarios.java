package Usuarios;
import Usuarios.Permiso;

public class Usuarios {
    String name;

    public Usuarios (String name) {
        this.name = name;

        Permiso autorizacion = new Permiso();
        //autorizacion.au
    }

    public String getName() {
        return  name;
    }

}

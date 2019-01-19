package practica4.ejercicio1;

import java.util.ArrayList;

public class Movistar extends Proveedor{

    public Movistar(Servicio servicio, String nombre) {
        super(servicio, nombre);
        super.contratoList = new ArrayList<>();
    }
}

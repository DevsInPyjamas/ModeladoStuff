package practica4.Ejercicio1;

import java.util.ArrayList;

public class ADSL extends Servicio{

    public ADSL() {
        super();
        super.proveedores = new ArrayList<>();
    }

    public void consumir() {
        super.consumir();
        System.out.println("YO ME LA METO TODAAAA");
    }
}

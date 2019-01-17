package practica4.Ejercicio1;

import java.util.List;

public abstract class Servicio {
    private Proveedor proveedor;
    protected List<Proveedor> proveedores;

    public void consumir() {
        System.out.println("Yo no consumo nada");
    }

    public void addProveedor(Proveedor proveedor) {
        this.proveedores.add(proveedor);
    }
}

package practica4.ejercicio1;

import java.util.List;

public abstract class Servicio {
    private Proveedor proveedor;
    protected List<Proveedor> proveedores;

    public void consumir() {
    }

    public void addProveedor(Proveedor proveedor) {
        this.proveedores.add(proveedor);
    }
}

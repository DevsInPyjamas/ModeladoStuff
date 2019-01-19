package practica4.ejercicio1;

public class Contrato {
    private int precio;
    private Usuario usuario;
    private Proveedor proveedor;

    public Contrato(Usuario usuario, Proveedor proveedor, int precio) {
        this.usuario = usuario;
        this.proveedor = proveedor;
        this.precio = precio;
        proveedor.addContrato(this);
        usuario.addContrato(this);
    }

    public void removeContrato() {
        this.proveedor.removeContrato(this);
        this.usuario.removeContrato(this);
    }

    public Servicio ejecutar() {
        return proveedor.servicio;
    }
}

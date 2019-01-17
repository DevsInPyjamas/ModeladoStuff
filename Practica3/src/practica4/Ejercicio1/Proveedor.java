package practica4.Ejercicio1;

import java.util.List;

public abstract class Proveedor {
    private String nombre;
    Servicio servicio;
    protected List<Contrato> contratoList;

    public Proveedor(Servicio servicio, String nombre) {
        this.servicio = servicio;
        this.nombre = nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void addContrato(Contrato contrato) {
        contratoList.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        contratoList.remove(contrato);
    }
}

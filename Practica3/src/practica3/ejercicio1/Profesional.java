package practica3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Profesional {
    private List<Acceso> listaAccesos;

    public void addAcceso(Acceso acceso) {
        this.listaAccesos.add(acceso);
    }

    public void removeAcceso(Acceso acceso) {
        this.listaAccesos.remove(acceso);
    }

    public Iterable<Expediente> getAllAccesosExpedientes() {
        List<Expediente> listaExpedientes = new ArrayList<>();
        for(Acceso acceso : listaAccesos) {
            listaExpedientes.add(acceso.getAccedido());
        }
        return listaExpedientes;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "listaAccesos=" + listaAccesos +
                '}';
    }
}

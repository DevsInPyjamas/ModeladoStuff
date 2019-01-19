package practica3.ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Expediente {
    private List<Acceso> listaAccesos;
    private Paciente paciente;

    public Expediente(Paciente paciente) {
        listaAccesos = new LinkedList<>();
        this.paciente = paciente;
        paciente.addExpediente(this);
    }

    @Override
    public String toString() {
        return "Expediente{" +
                "listaAccesos=" + listaAccesos +
                '}';
    }

    public void addPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void addAcceso(Acceso acceso) {
        this.listaAccesos.add(acceso);
    }

    public void removeAcceso(Acceso acceso) {
        this.listaAccesos.remove(acceso);
    }

    public void eliminarExpediente(){
        this.paciente.eliminarExpediente(this);
    }

    public Iterable<Acceso> getAllAccesosByProfesionales(){
        return listaAccesos;
    }
}

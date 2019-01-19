package practica3.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Paciente {
    private Expediente expedienteAbierto;
    private List<Expediente> expedientes;

    public Paciente() {
        expedientes = new LinkedList<>();
        Expediente expediente = new Expediente(this);
        expediente.addPaciente(this);
    }

    public void addExpediente(Expediente expediente) {
        this.expedientes.add(expediente);
    }

    public void eliminarExpediente(Expediente expediente) {
        this.expedientes.remove(expediente);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "expedienteAbierto=" + expedienteAbierto +
                ", expedientes=" + expedientes +
                '}';
    }
}

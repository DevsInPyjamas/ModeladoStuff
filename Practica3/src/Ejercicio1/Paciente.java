package Ejercicio1;

import java.util.List;

public class Paciente {
    private Expediente expedienteAbierto;
    private List<Expediente> expedientes;

    public Paciente(Expediente expediente) {
        this.expedientes.add(expediente);
        expediente.addPaciente(this);
    }

    public void addExpediente(Expediente expediente) {
        this.expedientes.add(expediente);
    }

    public void eliminarExpediente(Expediente expediente) {
        this.expedientes.remove(expediente);
    }
}

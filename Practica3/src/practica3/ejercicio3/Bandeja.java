package practica3.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Bandeja {
    private int capacidad;
    protected List<Pieza> piezaList;
    private BandejaState currentState;

    public Bandeja(int capacidad) {
        piezaList = new ArrayList<>();
        this.capacidad = capacidad;
        this.currentState = new EmptyState();
    }

    public void put(Pieza p) {
        currentState.put(p, this);
    }

    public Pieza get() {
        return currentState.get(this);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setEstado(BandejaState newState) {
        this.currentState = newState;
    }

    @Override
    public String toString() {
        return "Bandeja{" +
                "capacidad=" + capacidad +
                ", piezaList=" + piezaList +
                ", currentState=" + currentState +
                '}';
    }
}

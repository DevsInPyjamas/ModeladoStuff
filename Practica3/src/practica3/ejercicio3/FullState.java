package practica3.ejercicio3;

public class FullState implements BandejaState {
    @Override
    public void put(Pieza p, Bandeja bandeja) {
        throw new RuntimeException("No se pueden añadir piezas a una bandeja llena");
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        if(bandeja.getCapacidad() == 1) {
            bandeja.setEstado(new EmptyState());
        } else {
            bandeja.setEstado(new NormalState());
        }
        Pieza first = bandeja.piezaList.get(0);
        bandeja.piezaList.remove(first);
        return first;
    }

    @Override
    public String toString() {
        return "FullState{}";
    }
}

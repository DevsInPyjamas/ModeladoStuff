package practica3.ejercicio3;

public class NormalState implements BandejaState {
    @Override
    public void put(Pieza p, Bandeja bandeja) {
       if(bandeja.piezaList.size() == bandeja.getCapacidad() - 1) {
            bandeja.setEstado(new FullState());
        }
        bandeja.piezaList.add(p);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        if(bandeja.piezaList.size() == 1) {
            bandeja.setEstado(new EmptyState());
        }
        Pieza first = bandeja.piezaList.get(0);
        bandeja.piezaList.remove(first);
        return first;
    }

    @Override
    public String toString() {
        return "NormalState{}";
    }
}

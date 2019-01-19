package practica3.ejercicio3;

public class EmptyState implements BandejaState {
    @Override
    public void put(Pieza p, Bandeja bandeja) {
        if(bandeja.getCapacidad() == 1) {
            bandeja.setEstado(new FullState());
        } else if(bandeja.getCapacidad() > 1) {
            bandeja.setEstado(new NormalState());
        }
        bandeja.piezaList.add(p);
    }

    @Override
    public Pieza get(Bandeja bandeja) {
        throw new RuntimeException("No se puede obtener piezas de una bandeja vacía");
    }

    @Override
    public String toString() {
        return "EmptyState{}";
    }
}

package practica3.ejercicio3;

public interface BandejaState {
    void put(Pieza p, Bandeja bandeja);
    Pieza get(Bandeja bandeja);
}

package practica4.ejercicio4b;

public class Biestable extends Estable {
    public Biestable() {
        this.currentState = new RedState(new BiestableMediator());
    }
}

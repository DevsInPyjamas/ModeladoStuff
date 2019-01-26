package practica4.ejercicio4b;

public class Triestable extends Estable {
    public Triestable() {
        this.currentState = new RedState(new TriestableMediator());
    }
}

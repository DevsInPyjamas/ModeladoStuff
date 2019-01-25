package practica4.ejercicio4;

public abstract class State {
    Mediador mediator;

    public State(Mediador mediator) {
        this.mediator = mediator;
    }

    abstract void cerrar(Estable estable);
    abstract void abrir(Estable estable);
    abstract String estado();
}

package practica4.ejercicio4;

public abstract class Estable {
    private State currentState;

    public Estable() {
        this.currentState = new RedState(new Mediador());
    }

    public void cerrar() {
        currentState.cerrar(this);
    }

    public void abrir() {
        currentState.abrir(this);
    }

    public String estado() {
        return currentState.estado();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}

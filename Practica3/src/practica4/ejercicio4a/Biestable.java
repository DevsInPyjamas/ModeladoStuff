package practica4.ejercicio4a;

public class Biestable {
    private State currentState;

    public Biestable() {
        this.currentState = new RedState();
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

package practica4.ejercicio4c;

public abstract class Estable {
    protected MediadorCambio mediadorCambio;
    protected State currentState;

    public void abrir() {
        currentState.abrir(this);
    }

    public void cerrar() {
        currentState.cerrar(this);
    }

    public String estado() {
        return currentState.estado(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public abstract void cambio();
}

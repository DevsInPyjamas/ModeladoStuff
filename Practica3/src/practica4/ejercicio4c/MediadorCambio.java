package practica4.ejercicio4c;

public class MediadorCambio {
    private boolean changed;
    private Semaphore semaphore;
    public MediadorCambio(boolean changed, Semaphore semaphore) {
        this.semaphore = semaphore;
        this.changed = changed;
    }

    public void cambio(Estable estable) {
        Estable nuevoEstable = new Triestable(semaphore);
        State currentState = estable.getCurrentState();
        currentState.setStateMediator(new TriestableMediator());
        nuevoEstable.setCurrentState(currentState);
        semaphore.setEstable(nuevoEstable);
    }
}

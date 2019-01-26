package practica4.ejercicio4c;

public class Triestable extends Estable {
    public Triestable(Semaphore semaphore) {
        this.currentState = new RedState(new TriestableMediator());
        this.mediadorCambio = new MediadorCambio(true, semaphore);
    }

    @Override
    public void cambio() {
        mediadorCambio.cambio(this);
    }
}

package practica4.ejercicio4c;

public class Biestable extends Estable {
    public Biestable(Semaphore semaphore) {
        this.currentState = new RedState(new BiestableMediator());
        this.mediadorCambio = new MediadorCambio(false, semaphore);
    }

    @Override
    public void cambio() {
        mediadorCambio.cambio(this);
    }
}

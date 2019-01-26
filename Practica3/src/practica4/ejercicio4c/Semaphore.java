package practica4.ejercicio4c;

public class Semaphore {
    private Estable estable;

    public void abrir() {
        estable.abrir();
    }

    public void cerrar() {
        estable.cerrar();
    }

    public String estado() {
        return estable.estado();
    }

    public void cambio() {
        estable.cambio();
    }

    public void setEstable(Estable estable) {
        this.estable = estable;
    }
}

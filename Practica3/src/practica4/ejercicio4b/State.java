package practica4.ejercicio4b;

public abstract class State {
    protected StateMediator stateMediator;
    abstract void abrir(Estable contexto);
    abstract void cerrar(Estable contexto);
    abstract String estado(Estable contexto);
}

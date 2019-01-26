package practica4.ejercicio4b;


public interface StateMediator {
    void abrir(State estado, Estable estable);
    void cerrar(State estado, Estable estable);
    void setRedState(RedState redState);
    void setYellowState(YellowState yellowState);
    void setGreenState(GreenState greenState);
}

package practica4.ejercicio4a;

public class RedState implements State {

    @Override
    public void cerrar(Biestable biestable) {
        throw new RuntimeException("No está permitido transitar desde rojo con la operación Cerrar");
    }

    @Override
    public void abrir(Biestable biestable) {
        biestable.setCurrentState(new GreenState());
    }

    @Override
    public String estado() {
        return "Rojo";
    }
}

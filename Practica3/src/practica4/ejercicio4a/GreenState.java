package practica4.ejercicio4a;

public class GreenState implements State {
    @Override
    public void cerrar(Biestable biestable) {
        biestable.setCurrentState(new RedState());
    }

    @Override
    public void abrir(Biestable biestable) {
        throw new RuntimeException("No está permitido transitar desde Verde con la operación Abrir");
    }

    @Override
    public String estado() {
        return "Verde";
    }
}

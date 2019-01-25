package practica4.ejercicio4;

public class GreenState extends State {
    public GreenState(Mediador mediator) {
        super(mediator);
    }

    @Override
    public void cerrar(Estable estable) {
        estable.setCurrentState(new YellowState(super.mediator));
    }

    @Override
    public void abrir(Estable estable) {
        throw new RuntimeException("No hay transiciones con la operación abrir() desde el estado Verde");
    }

    @Override
    public String estado() {
        return "Verde";
    }
}

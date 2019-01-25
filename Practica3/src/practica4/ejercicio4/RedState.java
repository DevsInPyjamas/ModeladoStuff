package practica4.ejercicio4;

public class RedState extends State{
    public RedState(Mediador mediator) {
        super(mediator);
    }

    @Override
    public void cerrar(Estable estable) {
        throw new RuntimeException("No hay transiciones con la operación cerrar() desde el estado Rojo");
    }

    @Override
    public void abrir(Estable estable) {
        estable.setCurrentState(new YellowState(super.mediator));
    }

    @Override
    public String estado() {
        return "Rojo";
    }
}

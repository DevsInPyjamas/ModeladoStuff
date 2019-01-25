package practica4.ejercicio4;

public class YellowState extends State {
    public YellowState(Mediador mediator) {
        super(mediator);
    }

    @Override
    public void cerrar(Estable estable) {
        super.mediator.cerrar();
    }

    @Override
    public void abrir(Estable estable) {
        super.mediator.abrir();
    }

    @Override
    public String estado() {
        return "Precaución";
    }
}

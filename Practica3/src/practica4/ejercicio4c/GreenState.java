package practica4.ejercicio4c;

public class GreenState extends State {

    public GreenState(StateMediator stateMediator) {
        this.stateMediator = stateMediator;
        stateMediator.setGreenState(this);
    }

    @Override
    void abrir(Estable estable) {
        stateMediator.abrir(this, estable);
    }

    @Override
    void cerrar(Estable estable) {
        stateMediator.cerrar(this, estable);
    }

    @Override
    String estado(Estable estable) {
        return "Verde";
    }

    @Override
    void setStateMediator(StateMediator stateMediator) {
        this.stateMediator = stateMediator;
        stateMediator.setGreenState(this);
    }
}

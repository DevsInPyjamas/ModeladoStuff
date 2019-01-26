package practica4.ejercicio4c;

public class YellowState extends State {

    public YellowState(StateMediator stateMediator) {
        this.stateMediator = stateMediator;
        stateMediator.setYellowState(this);
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
        return "Precaucion";
    }

    @Override
    void setStateMediator(StateMediator stateMediator) {
        this.stateMediator = stateMediator;
        stateMediator.setYellowState(this);
    }
}

package practica4.ejercicio4c;

public class RedState extends State {


    public RedState(StateMediator stateMediator) {
            this.stateMediator = stateMediator;
            stateMediator.setRedState(this);
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
        return "Rojo";
    }

    @Override
    void setStateMediator(StateMediator stateMediator) {
        this.stateMediator = stateMediator;
        stateMediator.setRedState(this);
    }
}

package practica4.ejercicio4c;

public class BiestableMediator implements StateMediator {
    private RedState redState;
    private GreenState greenState;

    @Override
    public void abrir(State estado, Estable estable) {
        if(estado.equals(redState)) {
            estable.setCurrentState(greenState);
        }
    }

    @Override
    public void cerrar(State estado, Estable estable) {
        if(estado.equals(greenState)) {
            estable.setCurrentState(redState);
        }
    }

    @Override
    public void setRedState(RedState redState) {
        this.redState = redState;
        if(greenState == null) {
            new GreenState(this);
        }
    }

    @Override
    public void setYellowState(YellowState yellowState) {
        throw new RuntimeException("Not possible to assign yellow to this object!");
    }

    @Override
    public void setGreenState(GreenState greenState) {
        this.greenState = greenState;
        if(redState == null) {
            new RedState(this);
        }
    }
}

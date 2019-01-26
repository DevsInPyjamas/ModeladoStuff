package practica4.ejercicio4b;

public class TriestableMediator implements StateMediator{
    private RedState redState;
    private YellowState yellowState;
    private GreenState greenState;

    @Override
    public void abrir(State estado, Estable estable) {
        if(estado.equals(yellowState)) {
            estable.setCurrentState(greenState);
        } else {
            estable.setCurrentState(yellowState);
        }
    }

    @Override
    public void cerrar(State estado, Estable estable) {
        if(estado.equals(yellowState)) {
            estable.setCurrentState(redState);
        } else {
            estable.setCurrentState(yellowState);
        }
    }

    @Override
    public void setRedState(RedState redState) {
        this.redState = redState;
        if(yellowState == null) {
            new YellowState(this);
        }
        if(greenState == null) {
            new GreenState(this);
        }
    }

    @Override
    public void setYellowState(YellowState yellowState) {
        this.yellowState = yellowState;
        if(greenState == null) {
            new GreenState(this);
        }
        if(redState == null) {
            new RedState(this);
        }
    }

    @Override
    public void setGreenState(GreenState greenState) {
        this.greenState = greenState;
        if(yellowState == null) {
            new YellowState(this);
        }
        if(redState == null) {
            new RedState(this);
        }
    }
}

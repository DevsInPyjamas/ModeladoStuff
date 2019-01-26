package examen2018V5;

public class Elevator {
    private int floor;
    private ElevatorState currentState;

    public void openDoors() {
        currentState.openDoors();
    }
    public void closeDoors() {
        currentState.closeDoors();
    }
    public void _0() {
        currentState._0();
    }
    public void _1() {
        currentState._1();
    }
    public void _2(){
        currentState._2();
    }
    public void finishMovement() {
        currentState.finishMovement();
    }

    public void stop() {
        currentState.stop();
    }

    public void setCurrentState(ElevatorState newState) {
        this.currentState = newState;
    }
}

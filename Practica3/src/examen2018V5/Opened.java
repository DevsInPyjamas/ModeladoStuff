package examen2018V5;

public class Opened implements ElevatorState{
    @Override
    public void openDoors() {

    }

    @Override
    public void closeDoors() {

    }

    @Override
    public void _0() {
        nope();

    }

    @Override
    public void _1() {
        nope();

    }

    @Override
    public void _2() {
        nope();

    }

    @Override
    public void stop() {
        nope();
    }

    @Override
    public void finishMovement() {
        nope();

    }

    private void nope() {
        throw new RuntimeException("No puedes hacer eso");
    }
}

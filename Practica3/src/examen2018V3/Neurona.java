package examen2018V3;

public abstract class Neurona {
    private Peso prevPeso;
    private Peso nextPeso;
    public abstract void aprender();

    void setNextPeso(Peso peso) {
        this.nextPeso = peso;
    }

    public void setPrevPeso(Peso peso) {
        this.prevPeso = peso;
    }
}

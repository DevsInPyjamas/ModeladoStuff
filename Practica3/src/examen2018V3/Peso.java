package examen2018V3;

public class Peso {
    private float peso;
    private Neurona prevNeurona;
    private Neurona nextNeurona;

    public Peso(float peso, Neurona prevNeurona, Neurona nextNeurona) {
        if (peso < 0 || peso > 1){
            throw new RuntimeException("Peso inválido");
        }
        this.peso = peso;
        this.prevNeurona = prevNeurona;
        this.nextNeurona = nextNeurona;
        if(this.prevNeurona != null)
            this.prevNeurona.setNextPeso(this);
        if(this.nextNeurona != null)
            this.nextNeurona.setPrevPeso(this);
    }
}

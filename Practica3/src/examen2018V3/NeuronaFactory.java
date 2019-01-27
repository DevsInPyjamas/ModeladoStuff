package examen2018V3;

public class NeuronaFactory {
    public Neurona getNeurona(TipoNeuronas tipoNeuronas) {
        switch (tipoNeuronas) {
            case Hopfield:
                return new NeuronaHopfield();
            case Adaline:
                return new NeuronaAdaline();
            default:
                throw new RuntimeException("No hay neuronas de ese tipo!");
        }
    }
}

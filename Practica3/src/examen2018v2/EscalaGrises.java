package examen2018v2;

public class EscalaGrises extends Decorador {
    public EscalaGrises(Imagen imagen) {
        super(imagen);
    }

    @Override
    public void mostrar() {
        System.out.print(" Escala Grises ");
        super.mostrar();
    }
}

package examen2018v2;

public class BajoAlto extends Decorador {
    public BajoAlto(Imagen imagen) {
        super(imagen);
    }

    @Override
    public void mostrar() {
        System.out.print(" Bajo Alto ");
        super.mostrar();
    }
}

package examen2018v2;

public class Difuminado extends Decorador {
    public Difuminado(Imagen imagen) {
        super(imagen);
    }

    @Override
    public void mostrar() {
        System.out.print(" Difuminando ");
        super.mostrar();
    }
}

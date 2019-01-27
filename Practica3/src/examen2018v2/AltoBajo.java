package examen2018v2;

public class AltoBajo extends Decorador {
    public AltoBajo(Imagen imagen) {
        super(imagen);
    }

    @Override
    public void mostrar() {
        System.out.print(" AltoBajo ");
        super.mostrar();
    }
}

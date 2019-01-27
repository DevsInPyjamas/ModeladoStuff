package examen2018v2;

public abstract class Decorador implements Imagen {
    private Imagen imagen;

    public Decorador(Imagen imagen) {
        this.imagen = imagen;
    }

    @Override
    public void mostrar() {
        this.imagen.mostrar();
    }
}

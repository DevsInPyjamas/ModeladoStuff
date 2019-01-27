package examen2018v2;

public class Main {
    public static void main(String[] args) {
        Imagen imagen = new Difuminado(
                new AltoBajo(
                        new EscalaGrises(
                                new Difuminado(
                                        new BajoAlto(
                                                new ImagenSinFiltros()
                                        )
                                )
                        )
                )
        );
        imagen.mostrar();
    }
}

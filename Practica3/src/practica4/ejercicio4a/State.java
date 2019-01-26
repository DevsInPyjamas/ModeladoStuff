package practica4.ejercicio4a;

public interface State {
    void cerrar(Biestable biestable);
    void abrir(Biestable biestable);
    String estado();
}

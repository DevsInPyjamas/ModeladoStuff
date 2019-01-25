package practica4;


import practica4.ejercicio4.Biestable;
import practica4.ejercicio4.Estable;
import practica4.ejercicio4.Triestable;


public class Main {
    public static void main(String[] args) {
        Estable b = new Biestable();
        System.out.println(b.estado());
        b.abrir();
        System.out.println(b.estado());
        b.cerrar();
        System.out.println(b.estado());
        Estable c = new Triestable();
        System.out.println(c.estado());
        c.abrir();
        System.out.println(c.estado());
        c.abrir();
        System.out.println(c.estado());
        c.cerrar();
        System.out.println(c.estado());
        c.cerrar();
        System.out.println(c.estado());
    }
}

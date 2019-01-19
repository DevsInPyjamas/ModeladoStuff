package practica3.ejercicio2;

public class Activo extends  Trabajador{
    public Activo(String nombre, String numeroSeguridadSocial, double salarioActivo) {
        super(nombre, numeroSeguridadSocial, salarioActivo);
    }

    @Override
    public void incrementa() {
        super.salario *= 1.02;
    }
}

package practica3.Ejercicio2;

public class Pensionista extends Trabajador {
    public Pensionista(String nombre, String numeroSeguridadSocial, double salarioPensionista) {
        super(nombre, numeroSeguridadSocial, salarioPensionista);
    }

    @Override
    public void incrementa() {
        super.salario *= 1.04;
    }
}

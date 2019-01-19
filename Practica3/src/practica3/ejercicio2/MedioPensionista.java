package practica3.ejercicio2;

public class MedioPensionista extends Trabajador {
    private Activo activo;
    private Pensionista pensionista;

    public MedioPensionista(String nombre, String numeroSeguridadSocial, double salarioActivo, double salarioPensionista) {
        super(nombre, numeroSeguridadSocial, salarioActivo + salarioPensionista);
        this.activo = new Activo(nombre, numeroSeguridadSocial, salarioActivo);
        this.pensionista = new Pensionista(nombre, numeroSeguridadSocial, salarioPensionista);
    }

    @Override
    public void incrementa() {
        activo.incrementa();
        pensionista.incrementa();
        super.salario = activo.nomina() + pensionista.nomina();
    }
}

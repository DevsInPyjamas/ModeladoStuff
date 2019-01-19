package practica3.ejercicio2;

public abstract class Trabajador {
    public String nombre;
    public String numeroSeguridadSocial;
    protected double salario;

    public Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
        this.nombre = nombre;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public double nomina() {
        return salario;
    }

    public abstract void incrementa();
}

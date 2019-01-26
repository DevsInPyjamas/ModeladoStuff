package dec2017;

public abstract class Decorador extends Fortaleza{
    private Fortaleza fortaleza;

    public Decorador(Fortaleza fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    int fuerzaDefensiva() {
        return fortaleza.fuerzaDefensiva();
    }

    @Override
    int fuerzaOfensiva() {
        return fortaleza.fuerzaOfensiva();
    }
}

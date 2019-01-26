package dec2017;

public class Foso extends Decorador {
    private int profundidad;

    public Foso(Fortaleza fortaleza, int profundidad) {
        super(fortaleza);
        this.profundidad = profundidad;
    }

    @Override
    int fuerzaDefensiva() {
        return super.fuerzaDefensiva() + profundidad;
    }

    @Override
    int fuerzaOfensiva() {
        return super.fuerzaOfensiva();
    }
}


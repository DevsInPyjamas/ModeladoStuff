package dec2017;

public class Catapulta extends Decorador {
    private int alcance;

    public Catapulta(Fortaleza fortaleza, int alcance) {
        super(fortaleza);
        this.alcance = alcance;
    }

    @Override
    int fuerzaDefensiva() {
        return super.fuerzaDefensiva();
    }

    @Override
    int fuerzaOfensiva() {
        return super.fuerzaOfensiva() + alcance;
    }
}

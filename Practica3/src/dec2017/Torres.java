package dec2017;

public class Torres extends Decorador {
    private int altura;

    public Torres(Fortaleza fortaleza, int alutra) {
        super(fortaleza);
        this.altura = alutra;
    }

    @Override
    int fuerzaDefensiva() {
        return super.fuerzaDefensiva() + altura;
    }

    @Override
    int fuerzaOfensiva() {
        return super.fuerzaOfensiva();
    }
}

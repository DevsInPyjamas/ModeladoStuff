package dec2017;

public class Castillo extends Decorador {
    private int soldados;
    private int alturaMuros;
    private int superficie;

    public Castillo(Fortaleza fortaleza, int soldados, int alturaMuros, int superficie) {
        super(fortaleza);
        this.soldados = soldados;
        this.alturaMuros = alturaMuros;
        this.superficie = superficie;
    }

    @Override
    int fuerzaOfensiva() {
        return super.fuerzaOfensiva() + soldados;
    }

    @Override
    int fuerzaDefensiva() {
        return super.fuerzaDefensiva() + alturaMuros + superficie;
    }
}

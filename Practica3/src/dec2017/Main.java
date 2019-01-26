package dec2017;

public class Main {
    public static void main(String[] args) {
        Fortaleza fortaleza = new Castillo(
                new Foso(
                        new Catapulta(
                                new Torres(new FortalezaBasica(), 5)
                                , 5)
                        , 5)
                , 5,5,5);
        System.out.println(fortaleza.fuerzaDefensiva());
        System.out.println(fortaleza.fuerzaOfensiva());
    }
}

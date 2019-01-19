package practica4.ejercicio2;

public class DateStrategy implements SorterStrategy {
    @Override
    public boolean before(Email email1, Email email2) {
        return email1.getDate().before(email2.getDate());
    }
}

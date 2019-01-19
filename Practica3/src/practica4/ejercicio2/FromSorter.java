package practica4.ejercicio2;

public class FromSorter implements SorterStrategy {
    @Override
    public boolean before(Email email1, Email email2) {
        return email1.getFrom().compareToIgnoreCase(email2.getFrom()) < 0;
    }
}

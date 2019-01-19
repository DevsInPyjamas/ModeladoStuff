package practica4.ejercicio2;

public class SubjectStrategy implements SorterStrategy {
    @Override
    public boolean before(Email email1, Email email2) {
        return email1.getSubject().compareToIgnoreCase(email2.getSubject()) < 0;
    }
}

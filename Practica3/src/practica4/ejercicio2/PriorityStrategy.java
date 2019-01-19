package practica4.ejercicio2;

public class PriorityStrategy implements SorterStrategy{
    @Override
    public boolean before(Email email1, Email email2) {
        return email1.getPriority().compareTo(email2.getPriority()) < 0;
    }
}

package practica4.ejercicio2;

public class Priority implements Comparable<Priority> {
    private int priority;

    public Priority(int priority) {
        this.priority = priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Priority o) {
        return this.getPriority() - o.getPriority();
    }
}

package practica3;

import practica3.Ejercicio2.MedioPensionista;

public class Main {
    public static void main(String[] args) {
        MedioPensionista mp = new MedioPensionista("Paco", "1234", 20.0, 30.0);
        mp.incrementa();
        System.out.println(mp.nomina());
    }
}

package practica3;

import practica3.ejercicio2.MedioPensionista;
import practica3.ejercicio3.Bandeja;
import practica3.ejercicio3.Pieza;

public class Main {
    public static void main(String[] args) {
        Bandeja bandeja = new Bandeja(4);
        Bandeja bandeja1 = new Bandeja(1);
        bandeja.put(new Pieza() {
            @Override
            public String toString() {
                return "Pieza 1";
            }
        });
        System.out.println(bandeja);
        bandeja.put(new Pieza() {
            @Override
            public String toString() {
                return "Pieza 2";
            }
        });
        System.out.println(bandeja);
        bandeja.put(new Pieza() {
            @Override
            public String toString() {
                return "Pieza 3";
            }
        });
        System.out.println(bandeja);
        bandeja.put(new Pieza() {
            @Override
            public String toString() {
                return "Pieza 4";
            }
        });
        System.out.println(bandeja);
        try{
            bandeja.put(new Pieza() {
                @Override
                public String toString() {
                    return "Pieza 4";
                }
            });
        } catch (RuntimeException e) {
            System.out.println("No more piezas" + e.getMessage());
        }
        System.out.println(bandeja.get() + " " + bandeja.toString());
    }
}

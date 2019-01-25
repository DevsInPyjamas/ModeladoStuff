package practica4.ejercicio3;

public class X implements XProxyInterface{

    @Override
    public void routine1(Object caller) {
        System.out.println("La rutina 1 ha sido llamada por " + caller.toString());
    }

    @Override
    public void routine2(double y, Object caller) {
        System.out.println("La rutina 2 ha sido llamada por " + caller.toString());

    }

    @Override
    public void routine3(int i, Object caller) {
        System.out.println("La rutina 3 ha sido llamada por " + caller.toString());

    }


    @Override
    public void routine4(Object caller) {
        System.out.println("La rutina 4 ha sido llamada por " + caller.toString());
    }
}

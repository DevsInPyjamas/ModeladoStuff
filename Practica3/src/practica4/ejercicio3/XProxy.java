package practica4.ejercicio3;

public class XProxy implements XProxyInterface{
    private X x;

    public XProxy(X x) {
        this.x = x;
    }

    @Override
    public void routine1(Object caller) {
        // es pública, por tanto cualquiera puede acceder
        // a ella, sea quien sea quein llama
        x.routine1(caller);
    }

    @Override
    public void routine2(double y, Object caller) {
        if(!(caller instanceof A || caller instanceof B)) {
            throw new RuntimeException("You are not allowed to invoke that routine");
        }
        x.routine2(y, caller);
    }

    @Override
    public void routine3(int i, Object caller) {
        if(!(caller instanceof A || caller instanceof C)) {
            throw new RuntimeException("You are not allowed to invoke that routine");
        }
        x.routine3(i, caller);
    }

    @Override
    public void routine4(Object caller) {
        if(!(caller instanceof X)) {
            throw new RuntimeException("You are not allowed to invoke that routine");
        }
        x.routine4(caller);
    }
}

package practica4;


import practica4.Ejercicio1.*;

public class Main {
    public static void main(String[] args) {
        Servicio adsl = new ADSL();
        Proveedor movistar = new Movistar(adsl, "Movistar");
        Usuario user = new Usuario();
        Contrato contrato = new Contrato(user, movistar, 5);
        adsl.consumir();
    }
}

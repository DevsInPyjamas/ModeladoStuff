package practica4.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Contrato> contratoList;

    public Usuario() {
        contratoList = new ArrayList<>();
    }

    public void addContrato(Contrato contrato) {
        this.contratoList.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        this.contratoList.remove(contrato);
    }
}

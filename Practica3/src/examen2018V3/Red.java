package examen2018V3;

import java.util.ArrayList;
import java.util.List;

public class Red {
    private List<Neurona> neuronaList;

    public Red(TipoNeuronas tipoNeuronas, int cantidadNeuronas) {
        NeuronaFactory neuronaFactory = new NeuronaFactory();
        neuronaList = new ArrayList<>();
        for(int i = 0; i < cantidadNeuronas; i++) {
            neuronaList.add(neuronaFactory.getNeurona(tipoNeuronas));
        }
    }
}

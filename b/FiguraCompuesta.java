package VIII.patrones.composite.b;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta {
    private List<Figurable> figurableList;

    public FiguraCompuesta() {
        figurableList = new ArrayList<>();
    }

    public void agregarFigurable(Figurable figurable) {
        figurableList.add(figurable);
    }

    public Double calculoSuperficieTotal() {
        Double superficieTotal = 0.0;
        for (Figurable figurable : figurableList) {
            superficieTotal += figurable.calculoArea();
        }
        return superficieTotal;
    }
}


package VIII.patrones.composite.b;

import java.util.ArrayList;
import java.util.List;

public class Compuesta implements Figurable{
    public List<Figurable> figurableList;

    public Compuesta() {
        figurableList = new ArrayList<>();
    }

    public void agregarFigurable(Figurable figurable){
        figurableList.add(figurable);
    }

    @Override
    public Double calculoArea() {
        Double areaTotal = 0.0;
        for (Figurable figurable : figurableList) {
            areaTotal += figurable.calculoArea();
        }
        return areaTotal;
    }
}

package VIII.patrones.composite.a;
import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{
    private List<Comprable> comprableList;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprableList = new ArrayList<>();
    }
    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }
    @Override
    public Double calcularPrecio() {
        Double sumaPrecio = 0.0;
        for (Comprable comprable : comprableList) {
            sumaPrecio += comprable.calcularPrecio();
        }
        return sumaPrecio - sumaPrecio*descuento;
    }
}

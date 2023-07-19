package VIII.patrones.composite.b;

public class Circulo implements Figurable {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calculoArea() {
        return Math.PI * radio * radio;
    }
}

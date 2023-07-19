package VIII.patrones.composite.b;

public class Triangulo implements Figurable {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculoArea() {
        return base * altura/2;
    }
}

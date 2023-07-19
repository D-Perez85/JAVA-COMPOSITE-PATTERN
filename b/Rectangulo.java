package VIII.patrones.composite.b;

public class Rectangulo implements Figurable{
    private Double alto;
    private Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }


    @Override
    public Double calculoArea() {
        return alto*largo;
    }
}

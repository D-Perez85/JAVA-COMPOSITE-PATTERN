package VIII.patrones.composite.b;

public class Main {
    public static void main(String[] args) {
        // Vagón
        Rectangulo rectangulo = new Rectangulo(5.0, 4.0);
        Circulo circulo = new Circulo(1.0);

        Compuesta vagon = new Compuesta();
        vagon.agregarFigurable(rectangulo);
        vagon.agregarFigurable(circulo);

        // Locomotora
        Rectangulo rectanguloBase = new Rectangulo(5.0, 4.0);
        Rectangulo rectanguloMedio = new Rectangulo(3.0, 2.0);
        Rectangulo rectanguloSuperior = new Rectangulo(3.0, 1.0);
        Triangulo triangulo = new Triangulo(2.0, 2.0);

        Compuesta locomotora = new Compuesta();
        locomotora.agregarFigurable(rectanguloBase);
        locomotora.agregarFigurable(rectanguloMedio);
        locomotora.agregarFigurable(rectanguloSuperior);
        locomotora.agregarFigurable(circulo);
        locomotora.agregarFigurable(circulo);
        locomotora.agregarFigurable(triangulo);

        // Tren
        FiguraCompuesta tren = new FiguraCompuesta();
        tren.agregarFigurable(locomotora);
        tren.agregarFigurable(vagon);
        tren.agregarFigurable(vagon);


        System.out.println("La superficie total del vagon es: " + vagon.calculoArea() + " cm.");
        System.out.println("La superficie total de la locomotora es: " + locomotora.calculoArea() + " cm.");
        System.out.println("La superficie total del tren es: " + tren.calculoSuperficieTotal() + " cm.");
    }

}

package VIII.patrones.composite.a;
public class Main {
    public static void main(String[] args) {
        Producto hamburguesa = new Producto("Hamburguesa",10.0);
        Producto papasFritas = new Producto("Papas Fritas",4.0);
        Producto gaseosa = new Producto("Gaseosa",3.0);
        Producto helado = new Producto("Helado", 2.0);
        Carrito carrito = new Carrito();

        Combo combo1 = new Combo(0.10);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(papasFritas);
        combo1.agregarComprable(gaseosa);

        //--- Hasta aquí no usamos el patrón

        Combo comboParejas = new Combo(0.20);
        comboParejas.agregarComprable(combo1);
        comboParejas.agregarComprable(combo1);

        Combo comboFamiliar = new Combo(0.25);
        comboFamiliar.agregarComprable(combo1);
        comboFamiliar.agregarComprable(comboParejas);
        comboFamiliar.agregarComprable(helado);
        comboFamiliar.agregarComprable(helado);
        comboFamiliar.agregarComprable(helado);

        //Aquí agrego al carrito
        carrito.agregarComprable(combo1);
        carrito.agregarComprable(comboParejas);
        carrito.agregarComprable(comboFamiliar);
        carrito.agregarComprable(gaseosa);
        carrito.agregarComprable(hamburguesa);

        //Aquí calculamos el precio total de carrito
        System.out.println("Precio final del carrito: " +carrito.calcularCarrito());

    }
}
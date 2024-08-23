public class Main {
    public static void main(String[] args) {

        //COMPUESTOS
        Component inventario = new Composite("Inventario");

        Component computadoras = new Composite("Computadoras");
        Component mobiliario = new Composite("Mobiliario");
        Component libros = new Composite("Libros");

        //HOJAS
        Component pc1 = new Leaf("Computadora 1", 1000);
        Component pc2 = new Leaf("Computadora 2", 1000);
        Component pc3 = new Leaf("Computadora 3", 1000);
        Component pc4 = new Leaf("Computadora 4", 1000);
        Component pc5 = new Leaf("Computadora 5", 1000);

        Component mesa = new Leaf("Mesa", 200);
        Component silla = new Leaf("Silla", 200);
        Component escritorio = new Leaf("Escritorio", 200);

        Component calculo = new Leaf("Libro de Calculo",300);
        Component fisica = new Leaf("Libro de Fisica",300);
        Component estadistica = new Leaf("Libro de Estadistica",300);

        //ASIGNAR HOJAS A LOS COMPUESTOS
        computadoras.agregar(pc1);
        computadoras.agregar(pc2);
        computadoras.agregar(pc3);
        computadoras.agregar(pc4);
        computadoras.agregar(pc5);

        mobiliario.agregar(mesa);
        mobiliario.agregar(silla);
        mobiliario.agregar(escritorio);

        libros.agregar(calculo);
        libros.agregar(fisica);
        libros.agregar(estadistica);

        //ASIGNAR COMPUESTOS A COMPUESTO INVENTARIO RAIZ
        inventario.agregar(computadoras);
        inventario.agregar(mobiliario);
        inventario.agregar(libros);

        //MOSTRAR ARBOL
        inventario.arbol();

        //MOSTRAR SUMA TOTAL DEL ARBOL
        System.out.println("VALOR DEL INVENTARIO: "+inventario.getValor());

        //ELIMINAR HOJA PC2
        computadoras.eliminar(pc2);

        //MOSTRAR ARBOL
        inventario.arbol();

        //MOSTRAR SUMA TOTAL DEL ARBOL
        System.out.println("VALOR DEL INVENTARIO: "+inventario.getValor());

        //ELIMINAR COMPUESTO LIBROS
        inventario.eliminar(libros);

        //MOSTRAR ARBOL
        inventario.arbol();

        //MOSTRAR SUMA TOTAL DEL ARBOL
        System.out.println("VALOR DEL INVENTARIO: "+inventario.getValor());
    }
}
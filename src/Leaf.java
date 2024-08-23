public class Leaf extends Component {

    public Leaf(String nombre, int valor) {
        super(nombre, valor);
    }

    @Override
    public void agregar(Component component) {
        System.out.println("No se permiten agregar elementos");
    }

    @Override
    public void eliminar(Component component) {
        System.out.println("No se permiten eliminar elementos");
    }

    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public void arbol() {
        System.out.println("- Elemento: "+nombre+" Valor: "+valor);
    }
}
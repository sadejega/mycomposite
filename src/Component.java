import java.util.List;
public abstract class Component {
    protected String nombre;
    protected int valor;
    protected List<Component> elementos;

    public Component(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public abstract void agregar(Component component);
    public abstract void eliminar(Component component);
    public abstract  int getValor();
    public abstract void arbol();
}

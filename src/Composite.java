import java.util.ArrayList;

public class Composite extends Component {

    public Composite(String nombre) {
        super(nombre, 0);
        elementos = new ArrayList<>();
    }

    @Override
    public void agregar(Component component) {
            elementos.add(component);
    }

    @Override
    public void eliminar(Component component) {
        elementos.remove(component);
    }

    @Override
    public int getValor() {
        int resultado = valor;
        for (Component item:elementos){
            resultado = resultado + item.getValor();
        }
        return resultado;
    }

    @Override
    public void arbol(){
        System.out.println(nombre);
        for(int i=0; i< elementos.size(); i++){
            elementos.get(i).arbol();
        }
        System.out.println("/"+nombre);
    }
}

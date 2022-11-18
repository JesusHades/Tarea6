
public class ADTPila<T> {

    private Nodo<T> top;
    private int tamanio;

    public ADTPila() {
        top = null;
        tamanio = 0;
    }

    public boolean Vacia() {
        if (tamanio == 0) {
            System.out.println("La pila esta vacia");
            return true;
            
        } else {
            return false;
        }

    }

    public int getTamaño() {
        return tamanio;
    }

    public void pop() {

        if (Vacia()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Dato extraido " + top.getDato());
            top = top.getSiguiente();
            tamanio--;
        }

    }

    public void peek() {

        if (Vacia()) {
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("El ultimo elemento es : " + top.getDato());
        }
    }

    public void push(T Dato) {
        Nodo<T> aux = new Nodo(Dato, top);
        top = aux;
        tamanio++;

    }

    public void transversal() {
        int cont = 0;
        Nodo aux = top;
        while (cont < tamanio) {
            System.out.print(aux.getDato() + "-->");
            aux = aux.getSiguiente();
            cont++;
        }
    }

    
}

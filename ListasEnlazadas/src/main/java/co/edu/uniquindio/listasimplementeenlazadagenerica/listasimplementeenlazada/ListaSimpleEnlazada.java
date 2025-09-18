package co.edu.uniquindio.listasimplementeenlazadagenerica.listasimplementeenlazada;

public class ListaSimpleEnlazada<T> {
    private Nodo<T> primero;
    private int tam;

    public ListaSimpleEnlazada() {
        primero = null;
        tam = 0;
    }

    public void agregarPrimero(T dato){
        Nodo<T> newNodo = new Nodo(dato);

        if(primero == null){
            primero = newNodo;
            tam++;
        }else{
            newNodo.setProximo(primero);
            primero = newNodo;
            tam++;
        }
    }

    public void mostrar(){
        Nodo<T> actual = primero;
        String mensaje = "[";
        do {
            mensaje += actual.getDato() + " ";
            actual = actual.getProximo();
        }while(actual !=null);

        mensaje += "]";
        System.out.println(mensaje);
    }

    public void agregarUltimo (T dato){
        Nodo<T> newNodo = new Nodo(dato);
        if(primero == null){
            primero = newNodo;
            tam++;
        }else{
            Nodo<T> actual = primero;
            while(actual.getProximo() != null){
                actual = actual.getProximo();
            }
            actual.setProximo(newNodo);
            tam++;
        }
    }
}

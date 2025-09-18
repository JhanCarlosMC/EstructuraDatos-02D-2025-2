package co.edu.uniquindio.listasimplementeenlazada;

public class ListaSimpleEnlazada {
    private Nodo primero;
    private int tam;

    public ListaSimpleEnlazada() {
        primero = null;
        tam = 0;
    }

    public void agregarPrimero(Nodo newNodo){
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
        Nodo actual = primero;
        String mensaje = "[";
        do {
            mensaje += actual.getDato() + " ";
            actual = actual.getProximo();
        }while(actual !=null);

        mensaje += "]";
        System.out.println(mensaje);
    }
}

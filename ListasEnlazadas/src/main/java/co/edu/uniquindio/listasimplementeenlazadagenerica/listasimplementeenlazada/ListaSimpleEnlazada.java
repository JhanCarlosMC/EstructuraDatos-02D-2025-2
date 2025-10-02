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

    public boolean esVacia(){
        return (primero == null && tam == 0) ? true : false;
    }

    public int localizar(T datoBusqueda){
        Nodo<T> actual = primero;
        int indexBusqueda = 0;

        while (actual != null){
            if(actual.getDato().equals(datoBusqueda)){
                return indexBusqueda;
            }
            indexBusqueda++;
            actual = actual.getProximo();
        }
        return -1;
    }

    public boolean buscar(T datoBusqueda){
        Nodo<T> actual = primero;
        boolean flag = false;

        while (actual != null){
            if(actual.getDato().equals(datoBusqueda)){
                flag = true;
            }
            actual = actual.getProximo();
        }
        return flag;
    }

    public boolean eliminar(T datoBusqueda){
        Nodo<T> actual = primero;

        if(actual.getDato().equals(datoBusqueda)){
            primero = actual.getProximo();
            tam--;
            return true;
        }else{

            while(actual.getProximo() != null){
                if(actual.getProximo().getDato().equals(datoBusqueda)){
                    actual.setProximo(actual.getProximo().getProximo());
                    tam--;
                    return true;
                }
                actual = actual.getProximo();
            }
        }
        return false;
    }

//    public void agregarOrdenNatural(T dato){
//        Nodo<T> nuevoNodo = new Nodo(dato);
//
//        if(primero == null || dato.compareTo(primero.getDato()) <= 0){
//            nuevoNodo.setProximo(primero);
//            primero = nuevoNodo;
//        }else{
//            Nodo<T> actual = primero;
//            while(actual.getProximo() != null && dato.compareTo(actual.getProximo().getDato()) > 0){
//                actual = actual.getProximo();
//            }
//            nuevoNodo.setProximo(actual.getProximo());
//            actual.setProximo(nuevoNodo);
//        }
//        tam++;
//    }

}

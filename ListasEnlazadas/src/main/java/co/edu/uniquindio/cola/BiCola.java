package co.edu.uniquindio.cola;

public class BiCola<T> extends Cola{
    public BiCola(){
        super();
    }

    public void agregarInicio(T dato){
        Nodo<T> newNodo = new Nodo(dato);

        if(inicio == null){
            inicio = newNodo;
            fin = newNodo;
            tam++;
            return;
        }

        newNodo.setProximo(inicio);
        inicio = newNodo;
        tam++;
    }

    public void eliminarFin(){

        if(fin == null){
            return ;
        }

        Nodo<T> auxiliar = inicio;

        while(auxiliar != null){
            if(auxiliar.getProximo() == fin){
                break;
            }
            auxiliar = auxiliar.getProximo();
        }

        fin = auxiliar;
        tam--;
        fin.setProximo(null);
    }
}

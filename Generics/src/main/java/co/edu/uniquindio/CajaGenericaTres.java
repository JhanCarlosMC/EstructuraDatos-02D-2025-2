package co.edu.uniquindio;

public class CajaGenericaTres<E, T> {
    private E elementoDos;
    private T elementoUno;


    public CajaGenericaTres(E elementoDos, T elementoUno) {
        this.elementoDos = elementoDos;
        this.elementoUno = elementoUno;
    }

    public E getElementoDos() {
        return elementoDos;
    }

    public void setElementoDos(E elementoDos) {
        this.elementoDos = elementoDos;
    }

    public T getElementoUno() {
        return elementoUno;
    }

    public void setElementoUno(T elementoUno) {
        this.elementoUno = elementoUno;
    }
}

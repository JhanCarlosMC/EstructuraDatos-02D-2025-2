package co.edu.uniquindio;

public class CajaGenericaDos<E> {
    private E elementoDos;
    private E elementoUno;


    public CajaGenericaDos(E elementoDos, E elementoUno) {
        this.elementoDos = elementoDos;
        this.elementoUno = elementoUno;
    }

    public E getElementoDos() {
        return elementoDos;
    }

    public void setElementoDos(E elementoDos) {
        this.elementoDos = elementoDos;
    }

    public E getElementoUno() {
        return elementoUno;
    }

    public void setElementoUno(E elementoUno) {
        this.elementoUno = elementoUno;
    }
}

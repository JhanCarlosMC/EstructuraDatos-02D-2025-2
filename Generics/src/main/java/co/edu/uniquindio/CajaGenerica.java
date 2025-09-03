package co.edu.uniquindio;

public class CajaGenerica<E> {
    private E elemento;

    public CajaGenerica(E elemento) {
        this.elemento = elemento;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public <U> U getMetodoGenerico(U elemento) {
        return elemento;
    }
}

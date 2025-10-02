package co.edu.uniquindio.cola;

public class Nodo<T> {
    private T dato;
    private Nodo proximo; //Referencia al siguiente elemento

    public Nodo(T dato) {
        this.dato = dato;
        proximo = null; //Null inicialmente ya que no referencia a nada antes de estar en la lista
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", proximo=" + proximo +
                '}';
    }
}

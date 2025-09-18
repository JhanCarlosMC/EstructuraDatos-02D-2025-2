package co.edu.uniquindio.listasimplementeenlazada;

public class Nodo {
    private int dato;
    private Nodo proximo; //Referencia al siguiente elemento

    public Nodo(int dato) {
        this.dato = dato;
        proximo = null; //Null inicialmente ya que no referencia a nada antes de estar en la lista
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
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

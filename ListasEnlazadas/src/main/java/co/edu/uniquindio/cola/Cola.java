package co.edu.uniquindio.cola;

public class Cola<T> {
    protected Nodo<T> inicio;
    protected Nodo<T> fin;
    protected int tam;

    public Cola() {
        inicio = null;
        fin = null;
        tam = 0;
    }

    public void encolar(T dato){
        Nodo<T> newNodo = new Nodo<>(dato);
        if(inicio == null){
            inicio = newNodo;
            fin = newNodo;
            tam++;
            return;
        }

        fin.setProximo(newNodo);
        fin = newNodo;
        tam++;
    }


    public T desencolar(){
        if(inicio == null){
            return null;
        }

        Nodo<T> aux = inicio;
        inicio = inicio.getProximo();
        tam--;
        return aux.getDato();
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}

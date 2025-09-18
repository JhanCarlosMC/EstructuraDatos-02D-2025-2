package co.edu.uniquindio.listasimplementeenlazada;

public class MainList {
    public static void main(String[] args) {
        ListaSimpleEnlazada lista = new ListaSimpleEnlazada();

        Nodo test = new Nodo(8);
        lista.agregarPrimero(new Nodo(5));
        lista.agregarPrimero(new Nodo(6));
        lista.agregarPrimero(new Nodo(7));
        lista.agregarPrimero(test);

        lista.mostrar();
        System.out.println(test.toString());

    }
}

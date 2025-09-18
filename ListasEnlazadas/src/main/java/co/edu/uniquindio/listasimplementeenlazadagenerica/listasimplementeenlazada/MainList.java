package co.edu.uniquindio.listasimplementeenlazadagenerica.listasimplementeenlazada;

import java.util.LinkedList;

public class MainList {
    public static void main(String[] args) {
        ListaSimpleEnlazada<String> lista = new ListaSimpleEnlazada<>();

        lista.agregarPrimero("una lista");
        lista.agregarPrimero("desde");
        lista.agregarPrimero("A todos");
        lista.agregarPrimero(" Hola");

        lista.mostrar();

    }
}

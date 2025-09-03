package co.edu.uniquindio.iteratoriterable;

import java.util.Iterator;

public class IteratorBiblioteca implements Iterator<Libro> {
    private Biblioteca biblioteca;
    private int index;

    public IteratorBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < biblioteca.size();
    }
    @Override
    public Libro next() {
        return biblioteca.obtenerLibro(index++);
    }
}

package co.edu.uniquindio.iteratoriterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca implements Iterable<Libro>{
    private Libro[] libros;
    private int indexLibro;

    public Biblioteca(int cantidadLibros) {
        this.indexLibro = 0;
        libros = new Libro[cantidadLibros];
    }
    public void agregarLibro(Libro newLibro){
        libros[indexLibro] = newLibro;
        indexLibro++;
    }
    public Libro obtenerLibro(int indexLibro){
        return libros[indexLibro];
    }
    public int size(){
        return indexLibro;
    }
    @Override
    public Iterator<Libro> iterator() {
        return new IteratorBiblioteca(this);
    }
}

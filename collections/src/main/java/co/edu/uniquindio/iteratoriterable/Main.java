package co.edu.uniquindio.iteratoriterable;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Biblioteca newBiblioteca = new Biblioteca(5);
        newBiblioteca.agregarLibro(new Libro("Cien años de soledad."));
        newBiblioteca.agregarLibro(new Libro("El nombre del viento."));
        newBiblioteca.agregarLibro(new Libro("El arte de la guerra."));

        for (Libro libro : newBiblioteca){
            System.out.println(libro);
        }

        Iterator<Libro> iterator = newBiblioteca.iterator();

        while (iterator.hasNext()){
            Libro libro = iterator.next();
            System.out.println(libro);
        }
    }
}

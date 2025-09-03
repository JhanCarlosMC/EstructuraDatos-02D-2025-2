package co.edu.uniquindio.comparablecomparator;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Libro> libros = new LinkedList<Libro>();
        libros.add(new Libro("Cien años de soledad", 1));
        libros.add(new Libro("Prejuicio", 3));
        libros.add(new Libro("El quijote", 4));

        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("----------------------");
        Collections.sort(libros);

        for (Libro libro : libros) {
            System.out.println(libro);
        }

        System.out.println("----------------------");
        Collections.sort(libros, new ComparatorLibroNombre());

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

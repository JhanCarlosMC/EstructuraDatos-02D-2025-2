package co.edu.uniquindio.comparablecomparator;

import java.util.Comparator;

public class ComparatorLibroNombre implements Comparator<Libro> {

    @Override
    public int compare(Libro libroComparing1, Libro libroComparing2) {
        return libroComparing1.getNombre().compareTo(libroComparing2.getNombre());
    }
}

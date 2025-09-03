package co.edu.uniquindio.comparablecomparator;

public class Libro implements Comparable<Libro>{
    private String nombre;
    private int isbn;

    public Libro(String nombre, int isbn) {
        this.nombre = nombre;
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + " - isbn = " + isbn;
    }

    @Override
    public int compareTo(Libro compareLibro) {
        return Integer.compare(this.getIsbn(), compareLibro.getIsbn());
//        return this.getIsbn() - compareLibro.getIsbn();
    }
}

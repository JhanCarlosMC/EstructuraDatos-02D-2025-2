package co.edu.uniquindio.ejercicio9;

public class Producto implements Comparable<Producto> {
    private String id;
    private String nombre;

    public Producto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return this.id.compareTo(o.id);
//        return Integer.compare(x,y);
    }
}

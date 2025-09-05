package co.edu.uniquindio.ejercicio9;

public interface IAlmacenable <T extends Comparable<T>>{
    void guardar(T producto);
    T maximo();
}

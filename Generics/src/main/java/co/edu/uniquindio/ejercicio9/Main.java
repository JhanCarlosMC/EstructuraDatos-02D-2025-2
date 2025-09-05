package co.edu.uniquindio.ejercicio9;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        Producto newProducto = new Producto("001", "Celular");
        Producto newProducto2 = new Producto("013", "PC");
        Producto newProducto3 = new Producto("004", "Cargador");

        almacen.guardar(newProducto);
        almacen.guardar(newProducto2);
        almacen.guardar(newProducto3);
        
        Producto productoMaximo = almacen.maximo();
        System.out.println(productoMaximo);
    }
}

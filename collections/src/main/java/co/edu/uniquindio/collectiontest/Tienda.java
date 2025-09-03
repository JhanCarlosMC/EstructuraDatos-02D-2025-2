package co.edu.uniquindio.collectiontest;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> listProductos;

    public Tienda() {
        listProductos = new ArrayList<>();
    }

    public boolean agregarProducto(String codigoProducto, String nombreProducto, double precioProducto){
        Producto newProducto = new Producto();

        listProductos.add(newProducto);
        return true;
    }
}

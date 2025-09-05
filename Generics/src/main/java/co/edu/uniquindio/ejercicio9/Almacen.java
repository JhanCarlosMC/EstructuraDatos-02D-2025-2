package co.edu.uniquindio.ejercicio9;

import java.util.Collections;
import java.util.LinkedList;

public class Almacen implements IAlmacenable<Producto>{
    LinkedList<Producto> listProductos = new LinkedList<>();

    public Almacen() {}


    @Override
    public void guardar(Producto producto) {
        listProductos.add(producto);
    }

    @Override
    public Producto maximo() {
        //Opcion 1
        Collections.sort(listProductos);
        return listProductos.getLast();

        //Opcion 2
//        Producto max = listProductos.get(0);
//        for (Producto producto : listProductos) {
//            if (max.compareTo(producto) < 0){
//                max = producto;
//            }
//        }
//        return max;
    }
}

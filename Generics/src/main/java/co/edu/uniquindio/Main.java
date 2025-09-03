package co.edu.uniquindio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        ArrayList<String> lista2 = new ArrayList<String>();

        lista.add("A");
        lista.add(2);

        lista2.add("B");
//        lista2.add(1);

        System.out.println(lista.get(0));

    }
}
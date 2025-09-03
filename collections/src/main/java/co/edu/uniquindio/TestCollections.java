package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Juan");
        list.add("Michael");
        list.add("Jose");

        System.out.println(list.hashCode());

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.reversed());

        int indexElemento = Collections.binarySearch(list, "Juan");
        System.out.println(indexElemento);
    }
}

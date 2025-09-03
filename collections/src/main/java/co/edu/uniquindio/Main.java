package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listEmpleados = new ArrayList<>(Arrays.asList(
                "Pedro", "Camilo", "Tomas", "Han"
        ));

        for (String nombre : listEmpleados) {
            if(nombre.charAt(0) == 'j' || nombre.charAt(0) == 'J'){
                listEmpleados.remove(nombre);
            }
        }

        System.out.println(listEmpleados);

        Collections.sort(listEmpleados);

        System.out.println(listEmpleados);
    }
}
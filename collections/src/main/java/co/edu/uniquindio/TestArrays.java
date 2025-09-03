package co.edu.uniquindio;

import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {
        Integer[] ar = {6,5,4,3,2,1};
        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

        Arrays.fill(ar, 2);
        System.out.println(Arrays.toString(ar));

        System.out.println("FB".hashCode());
        System.out.println("Ea".hashCode());
    }
}

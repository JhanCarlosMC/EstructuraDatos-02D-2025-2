package co.edu.uniquindio;

public class RecursionArregloMatriz {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//        recorrerArreglo(ar, 0);
        recorrerMatriz(matriz,0,0);
    }

    public static void recorrerMatriz(int[][] matriz, int fila, int columna){
        // Caso Base
        if(fila == matriz.length){
            return;
        }
//        System.out.println("[" + fila + ", " + columna + "] = " + matriz[fila][columna]);
        System.out.print(matriz[fila][columna] + " ");
        if(columna < matriz[fila].length-1){
            recorrerMatriz(matriz, fila, columna+1);
        }else{
            System.out.println();
            recorrerMatriz(matriz,fila+1,0);
        }
    }

    //Recorrer un arreglo de forma recursiva.
    public static void recorrerArreglo(int[] arr, int index) {
        if (index == arr.length) {
            return; // Caso Base
        }
        //Caso Recursivo
        recorrerArreglo(arr, index + 1);
        System.out.println(arr[index]);
    }
}

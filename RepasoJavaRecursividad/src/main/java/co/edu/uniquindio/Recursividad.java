package co.edu.uniquindio;

public class Recursividad {
    public static void main(String[] args) {
//        recursionMatrushka(5);
//        System.out.println(sumaRecursivaLuis(5));
//        sumaRecursivaTomas(5,0);
        System.out.println( sumaRecursivaVanesa(5) );
    }

    public static void recursionMatrushka(int capas){
        //Caso base
        if(capas == 0){
            System.out.println("El recursion matrushka esta vacio");
            return;
        }
        //Caso Recursivo
        System.out.println("Se comenzo a abrir la capa: " + capas);
        recursionMatrushka(capas-1);
        System.out.println("Se comenzo a cerrar la capa: " + capas);
    }

    public static int sumaRecursivaLuis(int numero){
        int resultado;
        if(numero == 1){
            return 1;
        }
        resultado = numero + sumaRecursivaLuis(numero-1);
        return resultado;
    }

    public static void sumaRecursivaTomas(int num, int cont) {
        if (num == 0) {
            System.out.println(cont);
        return;
    }
        cont += num;
        sumaRecursivaTomas(num-1,cont);
    }

    public static int sumaRecursivaVanesa(int n){
        if(n <= 1){
            return n;
        }else{
            return n + sumaRecursivaVanesa(n-1);
        }
    }
}

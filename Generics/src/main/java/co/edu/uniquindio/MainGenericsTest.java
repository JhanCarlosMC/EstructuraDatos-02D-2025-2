package co.edu.uniquindio;

public class MainGenericsTest {
    public static void main(String[] args) {
        CajaNormal cajaRaquel = new CajaNormal(7);
        System.out.println(cajaRaquel.getNumero());



//        CajaNormal cajaJuan = new CajaNormal("Sofia");
//        System.out.println(cajaJuan.getNumero());

        CajaGenerica<String> cajaJuanGenerica =
                new CajaGenerica<>("Sofia");
        System.out.println(cajaJuanGenerica.getElemento());

        CajaGenerica<Double> cajaDaniel = new CajaGenerica<>(1.0);
        System.out.println(cajaDaniel.getElemento());

        CajaGenericaDos<String> cajaMiguel =
                new CajaGenericaDos<>("Miguel", "Angel");

        CajaGenericaTres<String, Integer> cajaMiguelDos =
                new CajaGenericaTres<>("Miguel", 20);

        System.out.println(cajaJuanGenerica.getMetodoGenerico("Hola"));
        System.out.println(cajaJuanGenerica.getMetodoGenerico(2));
    }
}

package Interfaces;

public class InterfazPrincipal {
    Analizador analizador = (donde, que) -> {
        System.out.println("Buscando...");
        return false;
    };
    
    Analizador2 analizador2 = (d1, d2) -> Double.valueOf(d1);
    
    Analizador2 analizador2_1 = (String d1, String d2) -> {
        System.out.println("convirtiendo...");
        return Double.valueOf(d1);
    };
}

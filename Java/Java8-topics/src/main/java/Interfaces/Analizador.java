package Interfaces;

@FunctionalInterface
public interface Analizador {
    String NOMBRE = "Steph";
    
    boolean buscar(String donde, String que);
    
    static void metodoS(){
        System.out.println("soy Estatico");
    }
    
    default void metD(){
        System.out.println("soy Default");
    }
    
    //Java 9+
    /*private void metP(){
        System.out.println("soy Privado");
    }*/
}


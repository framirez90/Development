package Generics;

public class ManejadorU<T> {
    private T dato;

    public ManejadorU(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public static <T extends String> void suma(T s, T d){
        System.out.println(s+" "+d);
    }
    
}

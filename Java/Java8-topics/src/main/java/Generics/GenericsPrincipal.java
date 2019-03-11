package Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class GenericsPrincipal {

    ManejadorU<String> sManejadorU = new ManejadorU<>("manejadorU");
    ManejadorU<Integer> iManejadorU = new ManejadorU<>(123);

    public static void main(String[] args) {
        Persona persona1 = new Persona("Claudia", 24);
        Persona persona2 = new Persona("Claudia", 24);

        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());
        System.out.println(persona1.hashCode() == persona2.hashCode());

        persona1.setNombre("Otro");
        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());

        //Probando arraylist
        ArrayList<String> lista = new ArrayList<>();

        lista.add("cadena1");
        lista.add("cadena3");
        lista.add("cadena2");
        lista.add("cadena1");

        System.out.println(lista.contains("cadena0"));
        System.out.println(lista.indexOf("cadena1"));
        System.out.println(lista.get(0));
        System.out.println(lista.size());
        lista.remove(3);
        System.out.println(lista);

        //ArrayDeque<String> deque = new ArrayDeque<>();
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("cadena7");
        treeSet.add("cadena2");
        treeSet.add("cadena3");
        treeSet.add("cadena1");
        treeSet.add("cadena0");
        treeSet.add("cadena7");

        System.out.println(treeSet);

        Comparator<Persona> comparator = (a, b) -> {
            return a.getNombre().compareToIgnoreCase(b.getNombre());
        };

        TreeSet<Persona> tree = new TreeSet<>(comparator);

        tree.add(new Persona("Claudia", 24));
        tree.add(new Persona("Isaac", 21));
        tree.add(new Persona("Juan", 29));
        tree.add(new Persona("Gabriel", 79));

        System.out.println(tree);

    }
}

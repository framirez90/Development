package Excepciones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ExcepcionesPrincipal {

    public static void main(String[] args) {
        //java heap space
        ArrayList<String> arrayList = new ArrayList<>();
        Stream.generate(() -> "hola").forEach(t -> arrayList.add(t));

        //runtime
        int[] arreglo = new int[3];
        arreglo[3] = 4;

        Persona p = new Persona();

        try {
            p.posibleError();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("continuando...");

        try (MiRecurso miRecurso = new MiRecurso()) {
            miRecurso.strings.add("hola");
            miRecurso.strings.add("hola1");
            miRecurso.strings.add("hola2");
            miRecurso.strings.add("hola3");
            System.out.println(miRecurso.strings);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

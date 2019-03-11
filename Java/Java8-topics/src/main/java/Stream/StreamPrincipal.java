package Stream;

import java.util.ArrayList;

public class StreamPrincipal {

    public static void main(String[] args) {
        ArrayList<Persona> arrayList = new ArrayList();

        arrayList.add(new Persona("Brenda", 20));
        arrayList.add(new Persona("Claudia", 30));
        arrayList.add(new Persona("Alonso", 45));
        arrayList.add(new Persona("Mario", 23));
        arrayList.add(new Persona("Manuel", 67));
        arrayList.add(new Persona("Gabriel", 21));

        for (Persona persona : arrayList) {
            if ((persona.getNombre().contains("a"))) {
                System.out.println(persona.getNombre());
            }
        }

        arrayList.stream()
                .filter(p -> p.getNombre().contains("a"))
                .forEach(y -> System.out.println(y));

        arrayList.stream()
                .filter(p -> p.getEdad() % 2 == 0)
                .forEach(y -> System.out.println(y));

        arrayList.stream()
                .filter(p -> p.getNombre().length() > 4)
                .forEach(y -> System.out.println(y));
    }
}

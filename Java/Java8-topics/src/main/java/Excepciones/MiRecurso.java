package Excepciones;

import java.util.ArrayList;
import java.util.List;

public class MiRecurso implements AutoCloseable {

    List<String> strings = new ArrayList<>();

    @Override
    public void close() throws Exception {
        System.out.println("Vaciando lista...");
        strings.clear();
        System.out.println("Lista vacia...");
    }

}

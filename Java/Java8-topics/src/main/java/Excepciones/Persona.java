package Excepciones;

import java.io.IOException;

public class Persona {

    public void posibleError() throws IOException {
        throw new IOException();
    }
}

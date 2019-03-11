package Nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class NioPrincipal {

    public static void main(String[] args) {

        //Path
        Path dirDummy = Paths.get("C:\\User\\..\\evelasco\\Desktop\\archivo.txt");

        System.out.println(dirDummy.getRoot());
        System.out.println(dirDummy.getFileName());
        System.out.println(dirDummy.getNameCount());
        System.out.println(dirDummy.resolve("C:\\carpeta1\\carpeta2\\carpeta3"));
        System.out.println(dirDummy.normalize());

        //Path real
        Path dir = Paths.get("C:\\Users\\folder\\Desktop\\folder");

        //crear un archivo
        try {
            Files.createFile(dir.resolve("archivoNio.txt"));
            System.out.println("Archivo creado....");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        //crear un directorio
        try {
            //Files.createDirectory(dir.resolve("carpeta1"));
            Files.createDirectories(dir.resolve("carpeta1\\carpeta2\\carpeta3\\carpeta4"));
            System.out.println("directorio creado....");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        //copiar un archivo
        try {
            Files.copy(
                    dir.resolve("archivoNio.txt"),
                    dir.resolve("carpeta1\\copiaArchivo.txt")
            );
            System.out.println("archivo copiado....");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        //listar elementos de una carpeta
        try (Stream<Path> contenido = Files.walk(dir)) {
            contenido.forEach(p -> System.out.println(p));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        //lectura de archivo de texto
        Charset.availableCharsets().forEach((k, v) -> System.out.println(k + " " + v));
        try (Stream<String> contenido = Files.lines(dir.resolve("archivoNio.txt"), Charset.forName("ISO-8859-1"))) {
            contenido.forEach(p -> System.out.println(p));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        //convertir un archivo a una listA
        try {
            List<String> lista = Files.readAllLines(
                    dir.resolve("archivoNio.txt"),
                    Charset.forName("ISO-8859-1")
            );
            lista.stream().forEach(t -> System.out.println(t));

        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (Stream<Path> contenido = Files.walk(dir)) {
            //Files.createDirectory(dir.resolve("PDF"));
            contenido.filter(a -> a.getFileName().toString().endsWith(".pdf"))
                    .forEach(p -> {
                        try {
                            Files.copy(
                                    p,
                                    dir.resolve("PDF\\" + p.getFileName().toString())
                            );
                            System.out.println("archivo: " + p.getFileName().toString() + " copiado...");
                        } catch (IOException ex) {
                            System.out.println(ex);
                        }
                    });
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

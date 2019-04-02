package StreamOperaciones;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamOperacionesPrincipal {

  public static List<Persona> arrayList = Arrays.asList(
          new Persona("Brenda", LocalDate.now(), "MX"),
          new Persona("Claudia", LocalDate.of(1990, Month.MARCH, 10), "CDMX"),
          new Persona("Alonso", LocalDate.of(2018, Month.DECEMBER, 19), "CH"),
          new Persona("Mario", LocalDate.of(2000, Month.DECEMBER, 20), "JP"),
          new Persona("Manuel", LocalDate.of(1989, Month.JANUARY, 30), "MX"),
          new Persona("Gabriel", LocalDate.of(2005, Month.OCTOBER, 8), "MX"),
          new Persona("Gabriel", LocalDate.of(2005, Month.MAY, 8), "AR")
  );
  public static ArrayList<LocalDate> arrayListLocalDate = new ArrayList();

  public static void main(String[] args) {

    arrayList.stream()
            .filter(p -> p.getFechaNacimiento().getYear() > 1990)
            .forEach(s -> System.out.println("filter >1990\t " + s));

    System.out.println(
            "AnyMatch:\t " + arrayList.stream()
                    .anyMatch(p -> p.getFechaNacimiento().getYear() < 1989)
    );

    arrayList.stream()
            .filter(p -> p.getFechaNacimiento().getMonth() == Month.DECEMBER && p.getCiudadOrigen().equals("CDMX"))
            .forEach(s -> System.out.println("filter:\t " + s));

    //Map
    arrayList.stream()
            .map(t -> t.getFechaNacimiento())
            .filter(f -> f.getMonth() == Month.DECEMBER)
            .forEach(d -> arrayListLocalDate.add(d));

    arrayListLocalDate.stream().forEach(p -> System.out.println("Map:\t " + p));

    System.out.println("Map:\t " + arrayListLocalDate);

    //Peek incrementar 3 años imprimir los que nacieron despues de 1990
    arrayList.stream()
            .peek(p -> p.setFechaNacimiento(p.getFechaNacimiento().plusYears(3)))
            .filter(p -> p.getFechaNacimiento().getYear() > 1990)
            .forEach(p -> System.out.println("Peek:\t " + p));

    //sorted()
    arrayList.stream()
            .sorted()
            .forEach(p -> System.out.println("sorted():\t " + p));

    //sorted(Comparator)
    Comparator<Persona> comparator = Comparator.comparing(t -> t.getNombre());

    arrayList.stream()
            .sorted(comparator.thenComparing(t -> t.getCiudadOrigen()).reversed())
            .forEach(p -> System.out.println("sorted(Comparator):\t " + p));

    //Operaciones Finales
    //count
    long count = arrayList.stream().filter(p -> p.getCiudadOrigen().equals("CDMX")).count();
    System.out.println("count:\t " + count);

    //sum>
    int suma = arrayList.stream()
            .mapToInt(t -> t.getFechaNacimiento().getYear())
            .sum();
    System.out.println("sum:\t " + suma);

    //avg años de nacimientos de las personas
    OptionalDouble optionalDouble = arrayList.stream()
            .mapToDouble(t -> t.getFechaNacimiento().getYear())
            .average();

    System.out.println(
            optionalDouble.isPresent()
            ? optionalDouble.getAsDouble()
            : 0.0
    );

    double promedio2 = arrayList.stream()
            .mapToDouble(t -> t.getFechaNacimiento().getYear())
            .average()
            .orElse(0.0);

    System.out.println("avg:\t " + promedio2);

    double promedio3 = arrayList.stream()
            .mapToDouble(t -> t.getFechaNacimiento().getYear())
            .average()
            .orElseThrow(() -> new RuntimeException("No hay promedio"));

    //Collectors.toList()
    List<Persona> listaCMDX = arrayList.stream()
            .filter(t -> t.getCiudadOrigen().equals("CDMX"))
            .collect(Collectors.toList());

    System.out.println("Collect toList():\t " + listaCMDX);

    //Collectors.groupingBy 
    arrayList.stream()
            .collect(Collectors.groupingBy(t -> t.getCiudadOrigen()))
            .forEach((t, u) -> {
              System.out.println("Collectors.groupingBy:\t" + t + " " + u);
            });

    //Collectors.partitioningBy 
    arrayList.stream()
            .collect(Collectors.partitioningBy(t -> t.getFechaNacimiento().getYear() > 1990))
            .forEach((t, u) -> {
              System.out.println("Collectors.partitioningBy: " + t);
              u.stream().forEach((v) -> {
                System.out.println(v);
              });
              System.out.println("\n");
            });

    //findAny() -> Obtener la primer persona que haya nacido en la CDMX
    Optional<Persona> optional = arrayList.stream()
            .filter(t -> t.getCiudadOrigen().equals("CDMX"))
            .findAny();

    System.out.println("findAny()\t "
            + (optional.isPresent()
            ? optional.get()
            : null)
    );

    //anyMatch
    boolean resultado = arrayList.stream()
            .noneMatch(t -> t.getCiudadOrigen().equals("CDMX"));
    System.out.println("anyMatch:\t " + resultado);
  }
}

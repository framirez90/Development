package com.mx.java8;

import StreamOperaciones.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

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

  @Test
  public void patitioningBy() {
    arrayList.stream()
            .collect(Collectors.partitioningBy(t -> t.getFechaNacimiento().getYear() > 1990))
            .forEach((t, u) -> {
              System.out.println("Collectors.partitioningBy: " + t);
              u.stream().forEach((v) -> {
                System.out.println(v);
              });
              System.out.println("\n");
            });
  }
}

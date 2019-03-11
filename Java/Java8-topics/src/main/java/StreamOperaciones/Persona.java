package StreamOperaciones;

import java.time.LocalDate;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String ciudadOrigen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Persona(String nombre, LocalDate fechaNacimiento, String ciudadOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadOrigen = ciudadOrigen;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", ciudadOrigen=" + ciudadOrigen + '}';
    }

    @Override
    public int compareTo(Persona persona) {
        return this.getNombre().compareToIgnoreCase(persona.getNombre());
    }
}

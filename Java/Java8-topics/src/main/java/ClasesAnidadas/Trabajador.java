package ClasesAnidadas;

public class Trabajador {

    private String nombre;
    private Semana diaDescanso;
    private String mesVacaciones;

    public Trabajador(String nombre, Semana diaDescanso, String mesVacaciones) {
        this.nombre = nombre;
        this.diaDescanso = diaDescanso;
        this.mesVacaciones = mesVacaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Semana getDiaDescanso() {
        return diaDescanso;
    }

    public void setDiaDescanso(Semana diaDescanso) {
        this.diaDescanso = diaDescanso;
    }

    public String getMesVacaciones() {
        return mesVacaciones;
    }

    public void setMesVacaciones(String mesVacaciones) {
        this.mesVacaciones = mesVacaciones;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", diaDescanso=" + diaDescanso + ", mesVacaciones=" + mesVacaciones + '}';
    }

}

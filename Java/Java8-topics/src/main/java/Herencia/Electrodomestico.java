package Herencia;

public abstract class Electrodomestico implements IHerencia {

    private String capacidad;
    private String color;
    private String marca;
    private double precio;

    public Electrodomestico(String capacidad, String color, String marca, double precio) {
        this.capacidad = capacidad;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public Electrodomestico() {
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "capacidad=" + capacidad + ", color=" + color + ", marca=" + marca + ", precio=" + precio + '}';
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

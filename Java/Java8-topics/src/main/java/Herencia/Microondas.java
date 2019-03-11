package Herencia;

public class Microondas extends Electrodomestico {

    public Microondas(String capacidad, String color, String marca, double precio) {
        super(capacidad, color, marca, precio);
    }

    @Override
    public void prender() {
        System.out.println("prendiendo Microondas");
    }

    @Override
    public void apagar() {
        System.out.println("prendiendo Microondas");
    }

    @Override
    public void suspender() {
        System.out.println("suspendiendo Microondas");
    }
   
}

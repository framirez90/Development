package Herencia;

public class Lavadora extends Electrodomestico {

    public Lavadora(String capacidad, String color, String marca, double precio) {
        super(capacidad, color, marca, precio);
    }

    @Override
    public void prender() {
        System.out.println("prendiendo Lavadora");
    }

    @Override
    public void apagar() {
        System.out.println("apagando Lavadora");
    }

    @Override
    public void suspender() {
        System.out.println("supendiendo Lavadora");
    }

}

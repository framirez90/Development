package Herencia;

public class Refrigerador extends Electrodomestico {

    public Refrigerador(String capacidad, String color, String marca, double precio) {
        super(capacidad, color, marca, precio);
    }

    @Override
    public void prender() {
        System.out.println("prendiendo Refrigerador");
    }

    @Override
    public void apagar() {
        System.out.println("apagando Refrigerador");
    }

    @Override
    public void suspender() {
        System.out.println("suspendiendo Refrigerador");
    }
   
    
}

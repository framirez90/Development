package Herencia;

public class Bocho implements IHerencia {

    @Override
    public void prender() {
        System.out.println("prendiendo Bocho");
    }

    @Override
    public void apagar() {
        System.out.println("apagando Bocho");
    }

    @Override
    public void suspender() {
        System.out.println("supendiendo Bocho");
    }

}

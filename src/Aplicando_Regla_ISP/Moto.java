package Aplicando_Regla_ISP;

public class Moto implements AccionesVehiculo, AccionesAbastecer, AccionesEncenderApagar {

    public Moto() {
    }

    @Override
    public void encender() {
        System.out.println("encendiendo moto...");
    }

    @Override
    public void apagar() {
        System.out.println("apagando moto...");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando moto...");
    }

    @Override
    public void frenar() {
        System.out.println("frenando moto...");
    }

    @Override
    public void abastecer() {
        System.out.println("tanquendo moto...");
    }



}

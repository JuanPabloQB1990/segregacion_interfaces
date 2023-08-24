package Segregacion_Interfaces;

public class Moto implements AccionesVehiculo{

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
    public void llenarTanque() {
        System.out.println("tanquendo moto...");
    }

    @Override
    public void recargarEnergia() {
        throw new UnsupportedOperationException("las motos a combustion no recargan energia");
    }

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("las motos no despegan");
    }

    @Override
    public void aterrizar() {
        throw new UnsupportedOperationException("las motos no aterrizan");
    }

}

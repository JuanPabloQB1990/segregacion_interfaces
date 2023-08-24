package Segregacion_Interfaces;

public class Bicicleta implements AccionesVehiculo{
    public Bicicleta() {

    }

    @Override
    public void encender() {
        throw new UnsupportedOperationException("las bicicletas no encienden");
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("las bicicletas no apagan");

    }

    @Override
    public void acelerar() {
        System.out.println("pedaleando bicicleta...");
    }

    @Override
    public void frenar() {
        System.out.println("frenando bicicleta...");

    }

    @Override
    public void llenarTanque() {
        throw new UnsupportedOperationException("las bicicletas no tanquean");

    }

    @Override
    public void recargarEnergia() {
        throw new UnsupportedOperationException("las bicicletas no se recarga");

    }

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("las bicicletas no despegan");

    }

    @Override
    public void aterrizar() {
        throw new UnsupportedOperationException("las bicicletas no aterrizan");

    }
}

package Segregacion_Interfaces;

public class Carro implements AccionesVehiculo{

    public Carro() {
    }

    @Override
    public void encender() {
        System.out.println("encendiendo carro...");
    }

    @Override
    public void apagar() {
        System.out.println("apagando carro...");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando carro...");
    }

    @Override
    public void frenar() {
        System.out.println("frenando carro...");
    }

    @Override
    public void llenarTanque() {
        System.out.println("tanquendo carro...");
    }

    @Override
    public void recargarEnergia() {
        throw new UnsupportedOperationException("los carros a combustion no recargan energia");
    }

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("los carros no despegan");

    }

    @Override
    public void aterrizar() {
        throw new UnsupportedOperationException("los carros no aterrizan");

    }

}

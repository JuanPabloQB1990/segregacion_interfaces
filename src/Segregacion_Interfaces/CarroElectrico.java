package Segregacion_Interfaces;

public class CarroElectrico implements AccionesVehiculo{
    public CarroElectrico() {
    }

    @Override
    public void encender() {
        System.out.println("encendiendo carro electrico...");
    }

    @Override
    public void apagar() {
        System.out.println("apagando carro electrico...");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando carro electrico...");
    }

    @Override
    public void frenar() {
        System.out.println("frenando carro electrico...");
    }

    @Override
    public void llenarTanque() {
        throw new UnsupportedOperationException("los carros electricos no tanquean con gasolina");

    }

    @Override
    public void recargarEnergia() {
        System.out.println("recargando bateria del carro electrico...");
    }

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("los carros electricos no despegan");
    }

    @Override
    public void aterrizar() {
        throw new UnsupportedOperationException("los carros electricos no aterrizan");
    }

}

package Aplicando_Regla_ISP;

public class CarroElectrico implements AccionesVehiculo, AccionesAbastecer, AccionesEncenderApagar {
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
    public void abastecer() {
        System.out.println("recargando bateria del carro electrico...");
    }



}

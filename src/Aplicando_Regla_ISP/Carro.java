package Aplicando_Regla_ISP;

public class Carro implements AccionesVehiculo, AccionesAbastecer, AccionesEncenderApagar {

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
    public void abastecer() {
        System.out.println("tanquendo carro...");
    }





}

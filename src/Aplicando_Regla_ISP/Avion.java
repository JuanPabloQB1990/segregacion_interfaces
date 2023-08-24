package Aplicando_Regla_ISP;

public class Avion implements AccionesVehiculo, AccionesVolar, AccionesEncenderApagar, AccionesAbastecer {
    public Avion() {

    }

    @Override
    public void encender() {
        System.out.println("encendiendo avion...");
    }

    @Override
    public void apagar() {
        System.out.println("apagando avion...");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando avion...");
    }

    @Override
    public void frenar() {
        System.out.println("frenando avion...");
    }

    @Override
    public void abastecer() {
        System.out.println("tanquendo avion...");
    }

    @Override
    public void despegar() {
        System.out.println(("despegando avion..."));

    }
    @Override
    public void aterrizar() {
        System.out.println(("aterrizando avion..."));

    }

}

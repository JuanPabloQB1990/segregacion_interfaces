package Aplicando_Regla_ISP;

public class Bicicleta implements AccionesVehiculo {
    public Bicicleta() {
    }

    @Override
    public void acelerar() {
        System.out.println("pedaleando bicicleta...");
    }

    @Override
    public void frenar() {
        System.out.println("frenando bicicleta...");
    }

}

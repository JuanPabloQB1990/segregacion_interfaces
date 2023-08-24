package Aplicando_Regla_ISP;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        Moto moto = new Moto();
        Carro carro = new Carro();
        CarroElectrico carroE = new CarroElectrico();
        Avion avion = new Avion();

        avion.acelerar();

    }
}
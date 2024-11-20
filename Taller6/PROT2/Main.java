package Taller6.PROT2;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Coche", "Toyota");
        vehiculo.mostrarDetalles();

        Moto moto = new Moto("Motocicleta", "Yamaha", 150);
        moto.mostrarDetalles();
    }
}
package Taller6.PROT2;

public class Moto extends Vehiculo {
    protected double cilindrada;

    public Moto(String tipo, String marca, double cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    protected void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}

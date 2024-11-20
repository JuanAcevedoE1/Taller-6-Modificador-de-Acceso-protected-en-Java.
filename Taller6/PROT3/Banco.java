package Taller6.PROT3;

public class Banco {
    private double saldo; // Cambiado a private

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado: " + cantidad);
        } else {
            System.out.println("Cantidad a depositar debe ser mayor que 0");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado: " + cantidad);
        } else {
            System.out.println("Cantidad a retirar no válida");
        }
    }
}

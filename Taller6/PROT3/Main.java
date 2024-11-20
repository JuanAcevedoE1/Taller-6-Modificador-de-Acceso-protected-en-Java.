package Taller6.PROT3;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(1000);
        banco.mostrarSaldo();
        
        banco.depositar(500);
        banco.mostrarSaldo();
        
        banco.retirar(300);
        banco.mostrarSaldo();
    }
}
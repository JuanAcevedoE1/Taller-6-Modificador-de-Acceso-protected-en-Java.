package Taller6.PROT1;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Acevedo", 3000);
        empleado.mostrarInformacion();

        Gerente gerente = new Gerente("Elizabeth Moreno", 5000, "Ventas");
        gerente.mostrarInformacion();
    }
}
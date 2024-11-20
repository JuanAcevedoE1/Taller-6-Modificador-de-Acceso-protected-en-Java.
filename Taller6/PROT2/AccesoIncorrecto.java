package Taller6.PROT2;

public class AccesoIncorrecto {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Coche", "Toyota");
        // Esto generará un error de compilación
        // System.out.println(vehiculo.tipo); // Acceso protegido
    }
}
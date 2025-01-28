package Ejercicio3;

// Main.java
public class MainCuenta {
    public static void main(String[] args) {
        // Crear cuentas
        Cuenta cuenta1 = new Cuenta("Juan Pérez");
        Cuenta cuenta2 = new Cuenta("María López", 500.0);

        // Probar métodos
        System.out.println(cuenta1); // Mostrar saldo inicial
        System.out.println(cuenta2);

        cuenta1.ingresar(200.0);
        cuenta2.ingresar(-50.0); // No se hace nada

        System.out.println("Después de ingresar:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.retirar(50.0);
        cuenta2.retirar(600.0); // Saldo pasa a ser 0

        System.out.println("Después de retirar:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}

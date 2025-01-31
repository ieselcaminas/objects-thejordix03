package Ejercicio5;

import java.util.ArrayList;
import java.util.Date;

public class MainBanco {
    public static void main(String[] args) {
        // Crear un banco
        Banco banco = new Banco(1, "Banco Santander", new ArrayList<>());

        // Crear sucursales y asociarlas al banco
        Sucursal sucursal1 = new Sucursal(1, "Madrid", banco);
        Sucursal sucursal2 = new Sucursal(2, "Barcelona", banco);

        // Agregar sucursales al banco
        banco.agregarSucursal(sucursal1);
        banco.agregarSucursal(sucursal2);

        // Mostrar información del banco y sus sucursales
        System.out.println("Banco: " + banco.getNombre());
        System.out.println("Número de entidad: " + banco.getN_ent());
        System.out.println("Sucursales:");
        for (Sucursal s : banco.getSucursales()) {
            System.out.println(" - " + s);
        }

        // Crear un cliente
        Cliente jordi = new Cliente("123454", "Jordi");
        System.out.println("\nCliente: " + jordi.getNombre());

        // Crear cuenta corriente para el cliente
        CuentaCorriente cuentaJordi = new CuentaCorriente("ES1234567890", 1000, jordi);
        System.out.println("Cuenta: " + cuentaJordi);

        // Realizar una operación de depósito
        cuentaJordi.depositar(500);
        System.out.println("Depósito realizado. Saldo actual: " + cuentaJordi.getSaldo() + "€");

        // Realizar una operación de retiro
        boolean retiroExitoso = cuentaJordi.retirar(200);
        if (retiroExitoso) {
            System.out.println("Retiro realizado. Saldo actual: " + cuentaJordi.getSaldo() + "€");
        } else {
            System.out.println("No hay suficiente saldo para retirar.");
        }

        // Crear un préstamo para el cliente
        Prestamo pJordi = new Prestamo(1, 100, jordi);
        jordi.addPrestamo(pJordi);
        System.out.println("Préstamos de " + jordi.getNombre() + ":");
        for (Prestamo p : jordi.getPrestamos()) {
            System.out.println(p);
        }

        // Crear domiciliación
        Domiciliacion domiciliacion = new Domiciliacion(cuentaJordi, 150, new Date(), "Factura de electricidad");
        System.out.println("\nDomiciliación creada: " + domiciliacion);
    }
}

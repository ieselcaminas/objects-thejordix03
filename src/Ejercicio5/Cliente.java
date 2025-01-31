package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

// Clase Cliente
class Cliente {
    private String dni;
    private String nombre;
    private List<Prestamo> prestamos;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPrestamo(Prestamo prestamo) {
        if (prestamo != null) {
            prestamos.add(prestamo);
        }
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " (DNI: " + dni + ")";
    }
}

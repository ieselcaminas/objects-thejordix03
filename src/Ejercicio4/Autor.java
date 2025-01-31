package Ejercicio4;

// Autor.java
public class Autor {
    private String nombre;
    private String fechaNacimiento;

    // Constructor
    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // toString
    @Override
    public String toString() {
        return "Autor: " + nombre + ", Nacido el: " + fechaNacimiento;
    }
}

package Ejercicio4;

// Tema.java
public class Tema {
    private String nombre;

    // Constructor
    public Tema(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // toString
    @Override
    public String toString() {
        return nombre;
    }
}
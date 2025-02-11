package Ejercicio7;

// Lector.java
import java.util.ArrayList;

public class Lector {
    private String dni;
    private String nombre;
    private ArrayList<Ejemplar> ejemplaresPrestados;

    public Lector(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.ejemplaresPrestados = new ArrayList<>();
    }

    public void agregarEjemplarPrestado(Ejemplar ejemplar) {
        ejemplaresPrestados.add(ejemplar);
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public ArrayList<Ejemplar> getEjemplaresPrestados() { return ejemplaresPrestados; }
}

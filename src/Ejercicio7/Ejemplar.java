package Ejercicio7;


// Ejemplar.java (Entidad débil)
import java.util.ArrayList;

public class Ejemplar {
    private int numeroRegistro;
    private Libro libro;
    private ArrayList<Lector> historialLectores;

    public Ejemplar(int numeroRegistro, Libro libro) {
        this.numeroRegistro = numeroRegistro;
        this.libro = libro;
        this.historialLectores = new ArrayList<>();
    }

    public void agregarLector(Lector lector) {
        historialLectores.add(lector);
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    public Libro getLibro() {
        return libro;
    }
    public ArrayList<Lector> getHistorialLectores() {
        return historialLectores;
    }
}
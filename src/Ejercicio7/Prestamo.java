package Ejercicio7;

// Prestamo.java
import java.util.Date;

public class Prestamo {
    private Ejemplar ejemplar;
    private Lector lector;
    private Date fechaPrestamo;

    public Prestamo(Ejemplar ejemplar, Lector lector, Date fechaPrestamo) {
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.fechaPrestamo = fechaPrestamo;

        this.ejemplar.agregarLector(lector);
        this.lector.agregarEjemplarPrestado(ejemplar);
    }

    public Ejemplar getEjemplar() { return ejemplar; }
    public Lector getLector() { return lector; }
    public Date getFechaPrestamo() { return fechaPrestamo; }
}
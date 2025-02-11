package Ejercicio7;

// Main.java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Lorca", "A001");
        Tema tema = new Tema("Ciencia Ficción", "T001");
        Editorial editorial = new Editorial("PerronSanchez", "E001");
        Libro libro = new Libro("978-84-376-0494-7", "EL libro troll", autor, tema, editorial);

        Ejemplar ejemplar1 = new Ejemplar(1, libro);
        Ejemplar ejemplar2 = new Ejemplar(2, libro);
        libro.agregarEjemplar(ejemplar1);
        libro.agregarEjemplar(ejemplar2);

        Lector lector = new Lector("12345678A", "Pepe");
        Prestamo prestamo = new Prestamo(ejemplar1, lector, new Date());

        System.out.println("Préstamo registrado: " + prestamo.getEjemplar().getLibro().getTitulo() + " para " + prestamo.getLector().getNombre());
        System.out.println("DNI de " +  prestamo.getLector().getNombre() + " : " + lector.getDni());
        System.out.println("ISBN del libro'" +prestamo.getEjemplar().getLibro().getTitulo() +"' :"  + libro.getIsbn());
        System.out.println("Historial de lectores del ejemplar: " + ejemplar1.getHistorialLectores().size());
        System.out.println("El tema es " + tema.getNombre());
        System.out.println("El editorial es " + editorial.getNombre());
        System.out.println("Autor del libro registrado : " + autor.getNombre());



    }
}

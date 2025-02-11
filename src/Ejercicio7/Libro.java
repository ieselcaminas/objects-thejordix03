package Ejercicio7;


// Libro.java
import java.util.ArrayList;

public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private Tema tema;
    private Editorial editorial;
    private ArrayList<Ejemplar> ejemplares;

    public Libro(String isbn, String titulo, Autor autor, Tema tema, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.editorial = editorial;
        this.ejemplares = new ArrayList<>();
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
}


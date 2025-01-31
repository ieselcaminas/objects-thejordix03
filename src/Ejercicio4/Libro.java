package Ejercicio4;

// Libro.java
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private List<Tema> temas;

    // Constructor
    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = new ArrayList<>();
    }

    // Métodos para gestionar temas
    public void agregarTema(Tema tema) {
        this.temas.add(tema);
    }

    public List<Tema> getTemas() {
        return temas;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    // toString
    @Override
    public String toString() {
        return "Libro: " + titulo + "\n" +
                autor + "\nPáginas: " + paginas + "\nTemas: " + temas;
    }
}

package Ejercicio4;

// MainLibro.java
public class MainLibro {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor("Gabriel García Márquez", "06/03/1927");
        Autor autor2 = new Autor("Jane Austen", "16/12/1775");

        // Crear temas
        Tema tema1 = new Tema("Realismo mágico");
        Tema tema2 = new Tema("Novela histórica");
        Tema tema3 = new Tema("Romance");
        Tema tema4 = new Tema("Crítica social");

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", autor1, 417);
        libro1.agregarTema(tema1);
        libro1.agregarTema(tema2);

        Libro libro2 = new Libro("Orgullo y prejuicio", autor2, 432);
        libro2.agregarTema(tema3);
        libro2.agregarTema(tema4);

        // Mostrar información de los libros
        System.out.println(libro1);
        System.out.println();
        System.out.println(libro2);
    }
}

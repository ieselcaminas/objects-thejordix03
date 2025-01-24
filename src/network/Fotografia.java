package network;

public class Fotografia extends Publicacion {
    private String titulo;
    private String archivo;

    public Fotografia(String usuario, String titulo, String archivo) {
        super(usuario);
        this.titulo = titulo;
        this.archivo = archivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Título: " + titulo + ", Archivo: " + archivo;
    }
}

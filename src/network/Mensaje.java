package network;

public class Mensaje extends Publicacion {
    private int id;
    private String texto;

    public Mensaje(String usuario, int id, String texto) {
        super(usuario);
        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id + ", Texto: " + texto;
    }
}

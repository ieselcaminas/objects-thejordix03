package network;

import java.util.Date;

public class Publicacion {
    private String usuario;
    private Date fecha;
    private int likes;

    public Publicacion(String usuario) {
        this.usuario = usuario;
        this.fecha = new Date();
        this.likes = 0;
    }

    public String getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void like() {
        this.likes++;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + ", Fecha: " + fecha + ", Likes: " + likes;
    }
}

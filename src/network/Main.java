package network;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publicacion> listaPublicaciones = new ArrayList<>();

        Mensaje m = new Mensaje("Pedro", 1, "Hola, mundo!");
        listaPublicaciones.add(m);

        Fotografia f = new Fotografia("Juan", "Foto de un arcoiris", "arcoiris.jpg");
        f.like();
        listaPublicaciones.add(f);

        System.out.println("Lista de publicaciones:");
        for (Publicacion p : listaPublicaciones) {
            System.out.println(p);
        }

        System.out.println("\nPublicaciones de Juan:");
        publicacionesDe("Juan", listaPublicaciones);
    }

    private static void publicacionesDe(String nombre, List<Publicacion> listaPublicaciones) {
        listaPublicaciones.stream()
                .filter(p -> p.getUsuario().equals(nombre))
                .forEach(System.out::println);
    }
}

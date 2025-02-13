package Subastas;

import java.util.ArrayList;
import java.util.List;

// Clase Lote
class Lote {
    private int numero;
    private double precioSalida;
    private List<Articulo> articulos;
    private Pujador mejorPujador;
    private double mejorPuja;

    public Lote(int numero, double precioSalida) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.articulos = new ArrayList<>();
        this.mejorPujador = null;
        this.mejorPuja = 0;
    }

    public void addArticulo(Articulo articulo) {

        articulos.add(articulo);
    }

    public void recibirPuja(Pujador pujador, double cantidad) {
        if (cantidad > mejorPuja) {
            mejorPujador = pujador;
            mejorPuja = cantidad;
        }
    }

    public String adjudicarLote() {
        if (mejorPujador != null) {
            return "Lote " + numero + " adjudicado a " + mejorPujador.getNombre() + " por " + mejorPuja + "€";
        }
        return "Lote " + numero + " No adjudicado";
    }

    @Override
    public String toString() {

        return "Lote " + numero + " (Salida: " + precioSalida + "€) - Artículos: " + articulos;
    }
}
package Subastas;

import java.util.ArrayList;
import java.util.List;

// Clase Subasta
class Subasta {
    private String fecha;
    private List<Lote> lotes;
    private boolean abierta;

    public Subasta(String fecha) {
        this.fecha = fecha;
        this.lotes = new ArrayList<>();
        this.abierta = true;
    }

    public void addLote(Lote lote) {
        if (abierta) {
            lotes.add(lote);
        }
    }

    public void cerrarSubasta() {
        abierta = false;
    }

    public void imprimirResultados() {
        System.out.println("Resultados de la subasta en " + fecha + ":");
        for (Lote lote : lotes) {
            System.out.println(lote.adjudicarLote());
        }
    }
}

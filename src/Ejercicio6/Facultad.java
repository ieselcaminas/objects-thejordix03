package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

class Facultad {
    private String nombre;
    private List<Catedra> catedras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public void addCatedra(Catedra catedra) {
        catedras.add(catedra);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    @Override
    public String toString() {
        return "Facultad: " + nombre;
    }
}
//1 a n una lista
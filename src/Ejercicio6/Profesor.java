package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String nombre;
    private Departamento departamento;
    private List<Catedra> catedras;

    public Profesor(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.catedras = new ArrayList<>();
        departamento.addProfesor(this);
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
        return "Profesor: " + nombre + " (Departamento: " + departamento.getNombre() + ")";
    }
}

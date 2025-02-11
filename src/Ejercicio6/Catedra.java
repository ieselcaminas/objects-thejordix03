package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

class Catedra {
    private String nombre;
    private Departamento departamento;
    private Facultad facultad;
    private List<Profesor> profesoresAdscritos;

    public Catedra(String nombre, Departamento departamento, Facultad facultad) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.facultad = facultad;
        this.profesoresAdscritos = new ArrayList<>();
        departamento.addCatedra(this);
        facultad.addCatedra(this);
    }

    public void adscribirProfesor(Profesor profesor) {
        profesoresAdscritos.add(profesor);
        profesor.addCatedra(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    @Override
    public String toString() {
        return "Cátedra: " + nombre + " (Facultad: " + facultad.getNombre() + ")";
    }
}

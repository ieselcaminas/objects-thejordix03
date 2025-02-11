package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

class Departamento {
    private String nombre;
    private AreaConocimiento areaConocimiento;
    private List<Catedra> catedras;
    private List<Profesor> profesores;

    public Departamento(String nombre, AreaConocimiento areaConocimiento) {
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.catedras = new ArrayList<>();
        this.profesores = new ArrayList<>();
        areaConocimiento.addDepartamento(this);
    }

    public void addCatedra(Catedra catedra) {
        catedras.add(catedra);
    }

    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre + " (Área: " + areaConocimiento.getNombre() + ")";
    }
}

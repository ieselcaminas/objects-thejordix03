package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

class AreaConocimiento {
    private String nombre;
    private List<Departamento> departamentos;

    public AreaConocimiento(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void addDepartamento(Departamento departamento) {

        departamentos.add(departamento);
    }

    public String getNombre() {

        return nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String toString() {
        return "Área de Conocimiento: " + nombre;
    }
}

package Ejercicio6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear entidades
        AreaConocimiento area = new AreaConocimiento("Matemáticas");
        Departamento depto = new Departamento("Álgebra", area);
        Facultad facultad = new Facultad("Facultad de Ciencias");
        Catedra catedra = new Catedra("Geometría", depto, facultad);
        Profesor profesor = new Profesor("Dr. Juan Pérez", depto);

        // Crear relación de adscripción
        Adscripcion adscripcion = new Adscripcion(profesor, catedra, new Date());

        // Imprimir resultados
        System.out.println(area);
        System.out.println(depto);
        System.out.println(facultad);
        System.out.println(catedra);
        System.out.println(profesor);
        System.out.println(adscripcion);
    }
}

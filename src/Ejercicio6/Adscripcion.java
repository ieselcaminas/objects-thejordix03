package Ejercicio6;

import java.util.Date;

class Adscripcion {
    private Profesor profesor;
    private Catedra catedra;
    private Date fecha;

    public Adscripcion(Profesor profesor, Catedra catedra, Date fecha) {
        this.profesor = profesor;
        this.catedra = catedra;
        this.fecha = fecha;
        profesor.addCatedra(catedra);
        catedra.adscribirProfesor(profesor);
    }

    public Profesor getProfesor() {

        return profesor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Adscripción: Profesor " + profesor.getNombre() + " a Cátedra " + catedra.getNombre() + " el " + fecha;
    }
}

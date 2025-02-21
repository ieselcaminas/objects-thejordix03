package Ejercicio4;

import Ejercicio7.Libro;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private int cod_edi;
    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    public Editorial(int cod_edi, String nombre) {
        this.cod_edi = cod_edi;
        this.nombre = nombre;
    }

    public int getCod_edi() {
        return cod_edi;
    }

    public void setCod_edi(int cod_edi) {
        this.cod_edi = cod_edi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
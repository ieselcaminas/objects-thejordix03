package herencia.java.Animal;

/**
 * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas.
 */
public class Animal {
    public String nombre; // Cambiado a protected para que las subclases puedan acceder

    /**
     * Constructor para objetos de la clase Animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El método comunicarse es común, pero puede ser sobreescrito por las subclases.
     */
    public void comunicarse() {
        System.out.println("Mi nombre es " + nombre + " y soy un animal.");
    }

    /**
     * El método respirar es común para todos los animales
     */
    public void respirar() {
        System.out.println("Respiro aire.");
    }

    /**
     * Representación como cadena de un objeto Animal
     */
    @Override
    public String toString() {
        return "Animal: " + nombre;
    }
}

package herencia.java.Animal;

/**
 * Clase abstracta Mamífero que extiende de Animal
 */
public abstract class Mamifero extends Animal {

    public Mamifero(String nombre) {
        super(nombre);
    }

    /**
     * Método abstracto que será implementado por las subclases.
     */
    public abstract void comunicarse();

    public void mamar() {
        System.out.println(nombre + " está mamando cuando es pequeño.");
    }
}

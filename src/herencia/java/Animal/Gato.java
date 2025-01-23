package herencia.java.Animal;

/**
 * Clase Gato que extiende de Mamífero
 */
public class Gato extends Mamifero {

    public Gato(String nombre) {
        super(nombre);
    }

    public void perseguirOvillo() {
        System.out.println(nombre + " está persiguiendo un ovillo.");
    }

    @Override
    public void comunicarse() {
        System.out.println("Miau miau");
    }
}

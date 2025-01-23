package herencia.java.Animal;

/**
 * Clase Perro que extiende de Mamífero
 */
public class Perro extends Mamifero {

    public Perro(String nombre) {
        super(nombre);
    }

    public void traerZapatillas() {
        System.out.println(nombre + " trae las zapatillas.");
    }

    @Override
    public void comunicarse() {
        System.out.println("Guau guau");
    }
}

package herencia.java.Animal;

/**
 * Clase Tiburón que extiende de Animal
 */
public class Tiburon extends Pez {

    public Tiburon(String nombre) {
        super(nombre);
    }


    @Override
    public void comunicarse() {
        System.out.println(nombre + " se comunica moviendo sus aletas.");
    }
}

package herencia.java.Animal;

public class PezPayaso extends Pez {
    public PezPayaso(String nombre) {
        super(nombre);

    }
    @Override
    public void comunicarse() {

        System.out.println("Comunicando con burbujas");

    }
}

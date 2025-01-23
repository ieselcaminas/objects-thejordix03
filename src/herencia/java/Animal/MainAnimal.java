package herencia.java.Animal;

/**
 * Clase principal para probar el programa
 */
public class MainAnimal {
    public static void main(String[] args) {
        // Crear objetos y probar métodos
        Animal animal = new Animal("Pedro");
        System.out.println(animal.getNombre());
        animal.comunicarse();

        Perro perro = new Perro("Juan");
        perro.comunicarse();
        perro.traerZapatillas();
        perro.mamar();

        Gato gato = new Gato("Mishi");
        gato.comunicarse();
        gato.perseguirOvillo();

        Tiburon tiburon = new Tiburon("Bruce");
        tiburon.comunicarse();
        tiburon.respirar();

        PezPayaso pezPayaso = new PezPayaso("Nemo");
        pezPayaso.respirar();
        pezPayaso.moverse();
    }
}

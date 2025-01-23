package herencia.java.Animal;

public abstract class Pez extends Animal {
    public Pez( String nombre) {
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Pez comunicado");
    }
    public void respirar(){
        System.out.println("Pez respirado por braqnueas");
    }
    public void moverse(){
        System.out.println("Nado usando aletas");
    }


}

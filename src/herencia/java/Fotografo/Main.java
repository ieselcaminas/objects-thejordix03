package herencia.java.Fotografo;

public class Main {
    public static void main(String[] args) {
        Camara c = new Camara("Nikon");
        Fotografo pepe = new Fotografo("Pepe", c);
        pepe.tomarFoto();

        Movil movil = new Movil("Iphone");
        Fotografo juan = new Fotografo("Juan", movil);
        juan.tomarFoto();

        GoPro goPro = new GoPro("modelo");
        Fotografo andres = new Fotografo("Andrés", goPro);
        andres.tomarFoto();

    }
}
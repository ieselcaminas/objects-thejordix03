package herencia.java.Fotografo;

public class Camara implements TomarFoto{
    private String modelo;

    public Camara(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tomarFoto(){
        System.out.println("Hago una foto con la cámara");
    }
}
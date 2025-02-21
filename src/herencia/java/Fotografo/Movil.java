package herencia.java.Fotografo;

public class Movil implements TomarFoto{
    private String modelo;

    public Movil(String modelo) {
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
        System.out.println("Hago una foto con el móvil");
    }


}
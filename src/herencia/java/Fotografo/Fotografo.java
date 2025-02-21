package herencia.java.Fotografo;

public class Fotografo {
    private String nombre;
    private TomarFoto aparatoQueTomaFoto;

    public Fotografo(String nombre, TomarFoto aparatoQueTomaFoto) {
        this.nombre = nombre;
        this.aparatoQueTomaFoto = aparatoQueTomaFoto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TomarFoto getCamara() {
        return aparatoQueTomaFoto;
    }

    public void setCamara(TomarFoto aparatoQueTomaFoto) {
        this.aparatoQueTomaFoto = aparatoQueTomaFoto;
    }

    public void tomarFoto(){
        this.aparatoQueTomaFoto.tomarFoto();
    }
}
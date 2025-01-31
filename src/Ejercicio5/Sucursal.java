package Ejercicio5;

// Clase Sucursal
class Sucursal {
    private int id;
    private String nombre;
    private Banco banco;

    public Sucursal(int id, String nombre, Banco banco) {
        this.id = id;
        this.nombre = nombre;
        this.banco = banco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Sucursal: " + nombre + " (ID: " + id + "), Banco: " + banco.getNombre();
    }
}

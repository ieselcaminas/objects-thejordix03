package Ejercicio5;

// Clase Prestamo
class Prestamo {
    private int id;
    private double monto;
    private Cliente cliente;

    public Prestamo(int id, double monto, Cliente cliente) {
        this.id = id;
        this.monto = monto;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Préstamo ID: " + id + ", Monto: " + monto + "€, Cliente: " + cliente.getNombre();
    }
}

package Ejercicio3;

// Cuenta.java
public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor obligatorio solo con titular
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0; // Por defecto 0 si no se especifica
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Getter para titular
    public String getTitular() {
        return titular;
    }

    // Setter para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter para cantidad
    public double getCantidad() {
        return cantidad;
    }

    // Setter para cantidad
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Metodo
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Metodo retirar
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta de " + titular + " tiene un saldo de " + cantidad + " euros.";
    }
}

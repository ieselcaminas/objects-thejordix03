package Ejercicio5;

import java.util.Date;

// Clase CuentaCorriente
class CuentaCorriente {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public CuentaCorriente(String numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (saldo >= monto && monto > 0) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente (No. " + numeroCuenta + ") - Saldo: " + saldo + "€";
    }
}

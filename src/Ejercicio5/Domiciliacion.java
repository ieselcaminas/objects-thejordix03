package Ejercicio5;

import java.util.Date;

// Clase Domiciliacion
class Domiciliacion {
    private CuentaCorriente cuenta;
    private double monto;
    private Date fechaPago;
    private String concepto;

    public Domiciliacion(CuentaCorriente cuenta, double monto, Date fechaPago, String concepto) {
        this.cuenta = cuenta;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.concepto = concepto;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Override
    public String toString() {
        return "Domiciliación: " + concepto + ", Monto: " + monto + "€, Fecha: " + fechaPago.toString();
    }
}

package MaquinaExpendedora;

class MaquinaExpendedora {
    private double precioTique;
    private double dineroIngresado;
    private double cajonDinero;
    private final double[] denominaciones = {50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1};

    public MaquinaExpendedora(double precioTique, double cajonInicial) {
        this.precioTique = precioTique;
        this.dineroIngresado = 0;
        this.cajonDinero = cajonInicial;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            dineroIngresado += cantidad;
            System.out.println("Has ingresado: " + cantidad + "€");
        } else {
            System.out.println("Cantidad no válida");
        }
    }

    public String sacarTique() {
        if (dineroIngresado < precioTique) {
            return "Saldo insuficiente. Introduzca más dinero.";
        }

        double cambio = dineroIngresado - precioTique;

        if (cambio > cajonDinero) {
            return "Introduzca el importe exacto. No hay suficiente cambio.";
        }

        cajonDinero += precioTique;
        dineroIngresado = 0;

        return "Tique emitido. Cambio: " + calcularCambio(cambio);
    }

    private String calcularCambio(double cambio) {
        StringBuilder resultado = new StringBuilder();
        for (double denom : denominaciones) {
            int cantidad = (int) (cambio / denom);
            if (cantidad > 0) {
                resultado.append(cantidad).append(" moneda(s)/billete(s) de ").append(denom).append("€, ");
                cambio -= cantidad * denom;
            }
        }
        return resultado.length() > 0 ? resultado.substring(0, resultado.length() - 2) : "Sin cambio";
    }
}
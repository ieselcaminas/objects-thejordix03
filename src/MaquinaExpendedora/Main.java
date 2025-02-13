package MaquinaExpendedora;

// Clase Main
public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora(1.20, 10.00);

        maquina.ingresarDinero(5.00);
        System.out.println(maquina.sacarTique());
    }
}

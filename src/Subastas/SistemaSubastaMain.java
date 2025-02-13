package Subastas;
//Clase Main
public class SistemaSubastaMain {
    public static void main(String[] args) {
        // Crear subasta
        Subasta subasta = new Subasta("2025-03-01");

        // Crear lotes
        Lote lote1 = new Lote(1, 100);
        Lote lote2 = new Lote(2, 200);

        // Añadir artículos a los lotes
        lote1.addArticulo(new Articulo("Pintura", 150));
        lote2.addArticulo(new Articulo("Escultura", 300));

        // Añadir lotes a la subasta
        subasta.addLote(lote1);
        subasta.addLote(lote2);

        // Crear pujadores
        Pujador juan = new Pujador("Juan");
        Pujador maria = new Pujador("Maria");

        // Realizar pujas
        lote1.recibirPuja(juan, 120);
        lote2.recibirPuja(maria, 250);
        lote2.recibirPuja(juan, 280);

        // Cerrar subasta e imprimir resultados
        subasta.cerrarSubasta();
        subasta.imprimirResultados();
    }
}

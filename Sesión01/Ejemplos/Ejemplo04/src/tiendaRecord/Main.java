package tiendaRecord;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Producto usando el record
        Producto producto = new Producto("Monitor", 3299.99);

        // Muestra el toString() generado automáticamente por el record.
        System.out.println(producto);
    }
}
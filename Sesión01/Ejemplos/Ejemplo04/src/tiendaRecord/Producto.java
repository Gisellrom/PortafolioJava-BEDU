package tiendaRecord;

/***
 * Un record es una fomra concisa de definair una clase inmutable en Java
 *
 * Java genera:
 * Constructor
 * Getters
 * equals(), hashCode() y toString()
 *
 * ****/

public record Producto(String nombre, double precio) {

}

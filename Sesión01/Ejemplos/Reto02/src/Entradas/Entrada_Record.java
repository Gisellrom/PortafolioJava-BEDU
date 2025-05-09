package Entradas;

public class Entrada {
    String nombre;
    Double precio;

    public Entrada(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: "+nombre + " | "+"Precio: $"+precio);
    }
}

package Reto_02;

//1. Crea una clase llamada Entrada
public class Entrada {
    //2. Declaramos los siguientes atributos
    String nombre;
    Double entrada;

    //3. Crea un constructor que reciba ambos valores al crear el objeto
    public Entrada(String nombre, Double entrada) {
        this.nombre = nombre;
        this.entrada = entrada;
    }

    //4. Agrega un metodo publico llamado "mostrarInformacion()" que imprima el sig. formato:
    public void mostrarInformacion(){
        System.out.println("Evento: "+nombre+" | Precio: $"+entrada);
    }
}

package Reto_01;

/**
 * Reto 01: Sistema de emergencia
 * */
public class Main {
    public static void main(String[] args) {
        //Creamos una isntancia de cada tipo de unidad
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juan");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        //Llama al metodo "iniciarOperacion()"
        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}
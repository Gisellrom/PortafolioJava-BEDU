package Reto_01;

//2. Crea la clase Pasajero
public class Pasajero {
    String nombre;
    String pasaporte;

    public Pasajero(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    String getNombre(){
        return this.nombre;
    }

    String getPasaporte(){
        return this.pasaporte;
    }

}

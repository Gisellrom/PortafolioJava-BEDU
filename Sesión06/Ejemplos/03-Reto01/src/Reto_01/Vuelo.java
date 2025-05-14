package Vuelo;

public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    //Constructor del vuelo
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }


    boolean reservarAsiento(Pasajero p){
        this.asientoReservado.nombre = p.getNombre();
        this.asientoReservado.pasaporte = p.getPasaporte();
        return true;
    }

    boolean reservarAsiento(String nombre, String pasaporte){
        this.asientoReservado.nombre = nombre;
        this.asientoReservado.pasaporte = nombre;
        return true;
    }

    void cancelarReserva(){
        System.out.println("Cancelando reserva");
    }

    String obtenerItinerario(){
        return "✈\uFE0F Itinerario del vuelo:\n" +
                "Código: "+codigoVuelo +"\n"+
                "Destino: "+this.destino +"\n"+
                "Salida: "+this.horaSalida+"\n"+
                "Pasajero"+this.asientoReservado.getNombre();
    }

}

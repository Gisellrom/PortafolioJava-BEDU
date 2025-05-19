package Reto_01;

//1. Crea la clase Vuelo
public class Vuelo {
    final String codigoVuelo;       // (Constante) -> Código único del vuelo
    String destino; //Ciudad destino del vuelo
    String horaSalida; //Hora de salida en fomrato 24h
    Pasajero asientoReservado;      //(puede ser null) Referencia al pasajero que reservó el asiento

    //Constructor del vuelo
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //Asigna al pasajero si no hay reserva previa
    //Metodo con parámetro y valor de retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    // Metodo con sobrecarga permita reservar
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    //Elimina al pasajero asignado
    // Metodo sin retorno
    public void cancelarReserva() {
        asientoReservado = null;
    }

    //Muestra la informacion del vuelo y el pasajero
    // Metodo que retorna un String
    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}
package Reto_01;

public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        System.out.println("🎙️ Escena actual: " + paquete.getEscenaActual());
        System.out.println("Flotando en tu cápsula espacial, detectas una señal desconocida proveniente de una luna cercana...");
    }
}

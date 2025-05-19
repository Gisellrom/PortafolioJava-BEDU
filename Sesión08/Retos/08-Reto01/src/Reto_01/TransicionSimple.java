package Reto_01;

public class TransicionSimple implements TransicionHistoria {
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("➡️ El jugador aterriza en la luna y descubre una estructura alienígena semienterrada en el polvo...");
        } else {
            System.out.println("➡️  El jugador ignora la señal, pero pronto su nave comienza a fallar misteriosamente...");
        }
    }
}

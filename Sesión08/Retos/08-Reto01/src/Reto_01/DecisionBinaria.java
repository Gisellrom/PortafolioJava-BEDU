package Reto_01;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?");
        System.out.println("A: Aterrizar en la luna para investigar");
        System.out.println("B: Ignorar la señal y seguir tu ruta");
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}
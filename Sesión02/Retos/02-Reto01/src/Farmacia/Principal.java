package Farmacia;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        SimuladorFarmacia md1 = new SimuladorFarmacia();
        Scanner sc = new Scanner(System.in);

        //2. Solicitar al usuario que introduzca los siguientes datos:
        System.out.print("Ingresa el nombre del medicamento: \n:::");
        md1.medicamento = sc.nextLine();

        System.out.print("Ingresa el precio unitario del medicamento: \n:::");
        md1.precio = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingresa la cantidad del medicamento: \n:::");
        md1.piezas = sc.nextInt();
        sc.nextLine();

        sc.close();

        //3. Calcula el total sin descuento multiplicando el precio por la cantidad
        Double totalSinDescuento = (md1.precio * md1.piezas);

        //4. Si el total supera los $500.00, la farmacia ofrece el 15% de descuento
        var aplicaDes = totalSinDescuento > 500;
        Double descuento = aplicaDes? (totalSinDescuento*0.15):0;

        //4.1 De la cantidad sin descuento le restamos el descuento:
        Double total = totalSinDescuento - descuento;

        //5. Mostramos el resumen en consola:
        System.out.println("Medicamento: "+md1.medicamento +"\nCantidad: "+md1.piezas+
            "\nPrecio unitario: $"+md1.precio+"\nTotal sin descuento: $"+totalSinDescuento +
            "\n¿Aplica descuento? "+aplicaDes+"\nDescuento: $"+descuento+"\nTotal a pagar: $"+total);

    }
}
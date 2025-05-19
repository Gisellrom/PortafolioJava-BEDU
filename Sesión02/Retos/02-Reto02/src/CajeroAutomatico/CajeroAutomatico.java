package CajeroAutomatico;

import java.util.Scanner;

//1.Crea una clase llamada CajeroAutomatico
public class CajeroAutomatico {
    public static void main(String[] args) {
        //2.Definir un saldo inicial

        Double saldo = 1000.0;

        //Definir variables a utilizar
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Double deposito = 0.0;
        Double retirar = 0.0;

        //3. Muestra un menú interactivo en consola:
        do{
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleciona una opción: \n:::");
            opcion = sc.nextInt();
            sc.nextLine();

            // 5. Uitliza un switch para manejar las opciones
            switch(opcion){
                case 1 -> { //Consultar salto -> Mostrar el saldo actual
                    System.out.println("Tu saldo actual es: $" + saldo);
                }
                case 2 -> { //Depositar dinero -> Pedir monto a depositar y sumarlo al saldo
                    System.out.print("Ingresa el monto a depositar:");
                    System.out.print(" \n::: $");
                    deposito = sc.nextDouble();
                    sc.nextLine();
                    if(deposito <= 0) {
                        System.out.println("El monto debe ser mayor a 0. ");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Deposito realizado. Saldo actualizado: $"+saldo);
                }

                case 3 ->{ //Retirar dinero, pedir monto a retirar y validar si hay saldo suficiente, si no hay, mostrar un mensaje
                    do {
                        System.out.println("Ingresa el monto a retirar:");
                        System.out.print("::: $");
                        retirar = sc.nextDouble();
                        sc.nextLine();

                        if (saldo < retirar) {
                            System.out.println("El saldo no es suficiente.");
                        }
                    } while (saldo < retirar);

                    saldo -= retirar;
                    System.out.println("Saldo retirado: $"+retirar);
                    System.out.println("Retiro exitoso.");

                }


                case 4 -> { //salir
                    System.out.println("Gracias por utilizar el cajero. ¡Adios!");
                }

                default -> {
                    System.out.println("Opción no válida, intenta de nuevo...");
                }

            }
        }while(opcion != 4);
        sc.close();
    }
}

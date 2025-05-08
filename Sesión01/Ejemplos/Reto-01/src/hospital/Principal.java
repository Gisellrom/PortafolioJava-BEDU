package hospital;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        // 2. Utiliza la clase Scanner para solicitar los siguientes datos desde la consola:
        Scanner sc = new Scanner(System.in);

        //5.1 Crea un objeto de tipo Paciente
        Paciente p1 = new Paciente();

        //5.2 Asigna los valores ingresasdos por el usuario
        System.out.println("***************************************************");
        System.out.print("Ingresa el nombre del paciente: \n:::");
        p1.nombre = sc.nextLine();
        System.out.print("\uD83E\uDDEE Ingresa la edad del paciente: \n:::");
        p1.edad = sc.nextInt(); //no limpia el buffer en automatico
        sc.nextLine(); //limpia de nuevo el buffer
        System.out.print("Ingresa el numero del expediente del paciente:  \n:::");
        p1.num_expediente = sc.nextLine();

        sc.close(); //ceramos el scanner

        //5.3 Llama al método mostrarInformacion() para  mostrar los datos en consola:
        p1.mostrarInformacion();

        System.out.println("***************************************************");
    }
}
package hospital;

//1. Crea una clase llamada Paciente.
public class Paciente {
    //3. Declara atributos en la clase Paciente para almacenar esta información.
    String nombre;
    int edad;
    String num_expediente;

    //4. Agrega un método público llamado mostrarInformacion() que imprima el siguiente formato:
    public void mostrarInformacion(){

        System.out.println("************* Información  de (la) paciente: ************");
        System.out.println("Paciente: "+ nombre + " \nEdad: "+edad+"\nExpediente: "+num_expediente);
        System.out.println("********************************************************");
    }
}

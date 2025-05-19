package Reto_02;

//5.Crea una clase llamda "Principal"
public class Principal {

    public static void main(String[] args) {

        //6.Crear al menos dos objetos de tipo Entrada
        Entrada ent1 = new Entrada("Obra de Teatro", 450.0);
        Entrada ent2 = new Entrada("Cine", 250.0);

        //Mostramos la informacion invocando al metodo:
        ent1.mostrarInformacion();
        ent2.mostrarInformacion();

        //Utilizamos la clase "Entrada_Record", haciendo un registro extra
        Entrada_Record recEntr = new Entrada_Record("Concierto Record", 849.99);
        System.out.println(recEntr.toString());
    }
}
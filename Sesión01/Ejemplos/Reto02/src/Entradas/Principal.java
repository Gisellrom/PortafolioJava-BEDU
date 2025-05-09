package Entradas;

public class Principal {
    public static void main(String[] args) {

        Entrada ent1 = new Entrada("Obra de Teatro", 450.0);

        Entrada ent2 = new Entrada("Concierto TWP", 3000.0);

        ent1.mostrarInformacion();
        ent2.mostrarInformacion();

        Entrada_Record ent3 = new Entrada_Record("Concierto Zoe", 1500.0);

        System.out.println(ent3.toString());
    }
}
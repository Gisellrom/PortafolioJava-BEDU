//Sesión 01, Ejemplo 02: Programación orientada a objetos
public class Principal {
    public static void main(String[] args){
        // Crear un nuevo objeto de tipo Estudiante
        Estudiante estudiante1 = new Estudiante();

        // Asignar valores a los atributos
        estudiante1.nombre = "Gisell";
        estudiante1.edad = 24;

        // Llamar al método saludar() del objeto
        estudiante1.saludar();
    }
}

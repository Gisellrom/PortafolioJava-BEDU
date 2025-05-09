package tiendaSealed;

// Clase base sellada: solo las clases permitidas pueden extenderla.
// Mejora el control de herencia en jerarquías cerradas.
public sealed class Vehiculo permits Auto,Camion{
}

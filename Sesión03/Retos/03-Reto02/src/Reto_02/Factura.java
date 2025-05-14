package Reto_02;

import java.util.Optional;

public class Factura {
    //Atributos privados para encapsular los datos
    private Double monto;
    private String descripcion;
    private Optional<String> rfc;

    //Constructor, inicializar los atributos y convierte el RFC en Optional, puede ser null
    public Factura(Double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    //Devuelve un resumen de la factura
    String getResumen(){

        // Si el RFC está presente, se muestra. Si no, se muestra mensaje alternativo.

        String resumen = "📄 Factura generada:\n"+
        "Descripción: "+ this.descripcion +"\n"+
        "Monto: $"+this.monto +"\n"+
        "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}

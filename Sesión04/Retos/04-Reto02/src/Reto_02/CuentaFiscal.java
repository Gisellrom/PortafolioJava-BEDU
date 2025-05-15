package Reto_02;

import java.util.Objects;

public class CuentaFiscal {
    private String rfc;
    private Double saldoDisponible;

    public CuentaFiscal(String rfc, Double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("❌ El saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0.0;
        }

    }

    public String getRfc() {
        return rfc;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Metodo que valida si el RFC de la declaración coincide con el RFC de la cuenta
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    // Metodo para mostrar información de la cuenta
    public void mostrarCuenta() {
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}

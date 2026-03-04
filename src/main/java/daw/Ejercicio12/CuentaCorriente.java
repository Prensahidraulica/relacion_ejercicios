package daw.Ejercicio12;

public class CuentaCorriente extends Cuenta {

    private final double interesFijo;
    private double saldoMinimo;

    // Constructor heredado
    public CuentaCorriente(Persona cliente, double saldoMinimo) {
        super(cliente);
        this.interesFijo = 0.015;
        this.saldoMinimo = saldoMinimo;
    }

    // Getters y Setters
    public double getInteres() {
        return interesFijo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    // Método toString
    @Override
    public String toString() {
        return "CuentaCorriente [Interes = " + interesFijo * 100 + ", Saldo Mínimo =" + saldoMinimo + "]";
    }

    // Método para añadir saldo a la cuenta
    public void actualizarSaldo(double valor) {
        if (saldo > 1000) {
            saldo = saldo + (saldoMinimo * interesFijo);
        } else {
            saldo = saldo + (saldo * interesFijo);
        }
    }

    // Método para quitar saldo a la cuenta
    @Override
    public void retirar(double cantidad) {
        if (getSaldo() - cantidad >= saldoMinimo) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("No se puede retirar. Se alcanzaría el saldo mínimo.");
        }
    }
}

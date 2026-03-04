package daw.Ejercicio12;

public class CuentaAhorro extends Cuenta {
    // Atributos
    private double interesVariable;
    private double comisionAnual;

    // Constructor heredado
    public CuentaAhorro(Persona cliente, double interesVariable, double comisionAnual) {
        super(cliente);
        this.interesVariable = interesVariable;
        this.comisionAnual = comisionAnual;
    }

    // Getters y Setters
    public double getInteresVariable() {
        return interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    // Método toString
    @Override
    public String toString() {
        return "CuentaAhorro [Interes Variable = " + interesVariable + ", Comisión Anual = " + comisionAnual + "]";
    }

    // Método para añadir saldo a la cuenta
    @Override
    public void actualizarSaldo(double cantidad) {
        saldo = (saldo + (saldo * interesVariable)) - comisionAnual;
    }

    // Método para quitar saldo a la cuenta
    @Override
    public void retirar(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

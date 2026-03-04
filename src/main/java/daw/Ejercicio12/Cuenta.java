package daw.Ejercicio12;

import org.apache.commons.lang3.RandomStringUtils;

public abstract class Cuenta {
    // Atributos
    protected String numeroCuenta;
    protected double saldo;
    protected Persona cliente;

    // Constructor parametrizado
    public Cuenta(Persona cliente) {
        this.saldo = 0;
        this.cliente = cliente;

        RandomStringUtils generador = RandomStringUtils.secure();
        this.numeroCuenta = generador.next(20);
    }

    // Getters y Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    } 

    // Método para añadir saldo a la cuenta
    public abstract void actualizarSaldo(double cantidad);
    
    // Método para quitar saldo a la cuenta
    public abstract void retirar(double cantidad);

}

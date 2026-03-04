package daw.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Manolo", "López Carretero", "10101010A");
        Persona p2 = new Persona("Flores", "García Ruiz", "20202020A");
        Persona p3 = new Persona("Angelines", "Chacón Reinols", "3030303A");

        Cuenta cuentaAhorro1 = new CuentaAhorro(p1, 3.2, 34);
        Cuenta cuentaAhorro2 = new CuentaAhorro(p2, 2.5, 15);
        Cuenta cuentaAhorro3 = new CuentaAhorro(p3, 1.8, 80);
        Cuenta cuentaCorriente1 = new CuentaCorriente(p1, 200);
        Cuenta cuentaCorriente2 = new CuentaCorriente(p2, 600);

        if (cuentaAhorro1 instanceof CuentaAhorro) {
            System.out.println("Comisión anual de la cuenta de ahorro 1: " + ((CuentaAhorro)cuentaAhorro1).getComisionAnual());
            System.out.println("Intereses variables de la cuenta de ahorro 1: " + ((CuentaAhorro)cuentaAhorro1).getInteresVariable());
            System.out.println("Saldo de la cuenta de ahorro 1: " + cuentaAhorro1.getSaldo());
            System.out.println("Número de cuenta: " + cuentaAhorro1.numeroCuenta);
            System.out.println();

            // Ejemplo similar a CuentaCorriente
            cuentaAhorro1.setSaldo(1200);
            cuentaAhorro1.actualizarSaldo(0);
            cuentaAhorro1.retirar(500);
            System.out.println("Saldo de la cuenta de ahorro 1 tras actualizar y retirar: " + cuentaAhorro1.getSaldo());
            System.out.println("--------------------------------------------------------------------");
        }

        if (cuentaAhorro2 instanceof CuentaAhorro) {
            System.out.println("Comisión anual de la cuenta de ahorro 1: " + ((CuentaAhorro)cuentaAhorro2).getComisionAnual());
            System.out.println("Intereses variables de la cuenta de ahorro 1: " + ((CuentaAhorro)cuentaAhorro2).getInteresVariable());
            System.out.println("Saldo de la cuenta de ahorro 1: " + cuentaAhorro2.getSaldo());
            System.out.println("Número de cuenta: " +cuentaAhorro2.numeroCuenta);
            System.out.println();
            
            // Ejemplo similar a CuentaCorriente
            cuentaAhorro2.setSaldo(800);
            cuentaAhorro2.actualizarSaldo(0);
            cuentaAhorro2.retirar(300);
            System.out.println("Saldo de la cuenta de ahorro 2 tras actualizar y retirar: " + cuentaAhorro2.getSaldo());
            System.out.println("--------------------------------------------------------------------");
            cuentaAhorro2.retirar(200);
        }
        
        if (cuentaAhorro3 instanceof CuentaAhorro) {
            System.out.println("Comisión anual de la cuenta de ahorro 3: " + ((CuentaAhorro)cuentaAhorro3).getComisionAnual());
            System.out.println("Intereses variables de la cuenta de ahorro 3: " + ((CuentaAhorro)cuentaAhorro3).getInteresVariable());
            System.out.println("Saldo de la cuenta de ahorro 3: " + cuentaAhorro3.getSaldo());
            System.out.println();

            cuentaAhorro3.setSaldo(500);
            cuentaAhorro3.actualizarSaldo(0);
            cuentaAhorro3.retirar(100);
            System.out.println("Saldo de la cuenta de ahorro 3 tras actualizar y retirar: " + cuentaAhorro3.getSaldo());
            System.out.println("--------------------------------------------------------------------");
        }
    
        
        if (cuentaCorriente1 instanceof CuentaCorriente) {
            System.out.println("Saldo mínimo de la cuenta corriente: " + ((CuentaCorriente)cuentaCorriente1).getSaldoMinimo());
            System.out.println("Número de la cuenta: "+ cuentaCorriente1.getNumeroCuenta());

            cuentaCorriente1.setSaldo(1200);
            cuentaCorriente1.actualizarSaldo(0);
            cuentaCorriente1.retirar(500);
            System.out.println();

            System.out.println("Saldo de la cuenta corriente 1 tras actualizar y retirar: " + cuentaCorriente1.getSaldo());
            System.out.println("--------------------------------------------------------------------");
        }

        if (cuentaCorriente2 instanceof CuentaCorriente) {
            System.out.println("Saldo mínimo de la cuenta corriente: " + ((CuentaCorriente)cuentaCorriente2).getSaldoMinimo());
            System.out.println("Número de la cuenta: "+ cuentaCorriente2.getNumeroCuenta());

            cuentaCorriente2.setSaldo(800);
            cuentaCorriente2.actualizarSaldo(0);
            cuentaCorriente2.retirar(300);
            System.out.println();

            System.out.println("Saldo de la cuenta corriente 2 tras actualizar y retirar: " + cuentaCorriente2.getSaldo());
        }
    }
}

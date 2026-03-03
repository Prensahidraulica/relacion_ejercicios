package daw.Ejercicio11;

public class Triangulo extends Figura{
    
    // Constructor
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    // Método abstracto calcularArea()
    @Override
    public double calcularArea() {
        return (getAltura() * getBase()) / 2.0;
    }
}

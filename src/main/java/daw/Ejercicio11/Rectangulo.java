package daw.Ejercicio11;

public class Rectangulo extends Figura{

    // Constructor
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    // Método abstracto calcularArea()
    @Override
    public double calcularArea() {
        return getAltura() * getBase();
    }
}

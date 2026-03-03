package daw.Ejercicio11;

public class Romboide extends Figura{
    
    // Constructor
    public Romboide(double base, double altura) {
        super(base, altura);
    }

    // Método abstracto calcularArea()
    @Override
    public double calcularArea() {
        return getAltura() * getBase();
    }
}

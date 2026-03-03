package daw.Ejercicio11;

public abstract class Figura {
    // Atributos
    protected double base;
    protected double altura;

    // Constructor
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters 
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método toString
    @Override
    public String toString() {
        return "Figura [base=" + base + ", altura=" + altura + "]";
    }

    // Método abstracto calcularArea()
    public abstract double calcularArea();
}

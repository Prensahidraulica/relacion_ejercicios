package daw.Ejercicio8;

import java.util.Random;

public class Moneda extends Azar{

    public Moneda(int posibilidades) {
        super(posibilidades);
    }

    @Override
    public int lanzar() {
        return new Random().nextInt(1, 3);
    }
    
}

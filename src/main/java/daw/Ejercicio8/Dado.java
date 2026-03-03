package daw.Ejercicio8;

import java.util.Random;

public class Dado extends Azar{

    public Dado(int posibilidades) {
        super(posibilidades);
    }

    @Override
    public int lanzar() {
        return new Random().nextInt(1, 7);
    }
    
}

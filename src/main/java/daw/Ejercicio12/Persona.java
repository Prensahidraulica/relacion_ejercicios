package daw.Ejercicio12;

public class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private String nif;

    // Constructor parametrizado
    public Persona(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona [Nombre = " + nombre + ", Apellidos = " + apellidos + ", NIF = " + nif + "]";
    }
}
